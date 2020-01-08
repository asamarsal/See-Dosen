package com.tugasuas.seedosen;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.UserProfileChangeRequest;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.google.firebase.storage.UploadTask;

import java.util.HashMap;
import java.util.Map;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Register extends AppCompatActivity {

    TextView judulregister;

    EditText Username,Nim,Email,Password;
    Button btnRegister;

    ImageView imgUser;
    FirebaseAuth fAuth;
    FirebaseFirestore fStore;

    static int PReqCode = 1;
    static int REQUESCODE = 1;
    Uri pickedImgUri;
    String userID;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        judulregister=(TextView)findViewById(R.id.tulisandaftar);

        Typeface customfont= Typeface.createFromAsset(getAssets(),"font/font3_2.otf");
        judulregister.setTypeface(customfont);

        Username = findViewById(R.id.username);
        Nim = findViewById(R.id.nim);
        Email = findViewById(R.id.email);
        Password = findViewById(R.id.password);
        btnRegister = findViewById(R.id.btnregister);
        imgUser = findViewById(R.id.regUserFoto);

        fAuth = FirebaseAuth.getInstance();
        fStore = FirebaseFirestore.getInstance();


        if (fAuth.getCurrentUser() != null){
            startActivity(new Intent(getApplicationContext(),Rumah.class));
            finish();
        }

        imgUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Build.VERSION.SDK_INT >= 22){
                    checkandRequestForPermission();
                }
                else{
                    openGallery();
                }
            }
        });


        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = Email.getText().toString().trim();
                String password = Password.getText().toString().trim();
                String username = Username.getText().toString().trim();
                String nim = Nim.getText().toString();

                if (TextUtils.isEmpty(email)){
                    Email.setError("Email Dibutuhkan");
                    return;
                }
                if (TextUtils.isEmpty(password)){
                    Password.setError("Password Dibutuhkan");
                    return;
                }
                if (password.length() < 5){
                    Password.setError("Jumlah Karakter Minimal Adalah 5 Karakter");

                }



                //Register User
                fAuth.createUserWithEmailAndPassword(email,password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {

                            //Save data ke database
                            userID = fAuth.getCurrentUser().getUid();
                            DocumentReference documentReference = fStore.collection("users").document(userID);
                            Map<String,Object> user = new HashMap<>();
                            user.put("username", username);
                            user.put("nim", nim);
                            user.put("email", email);
                            documentReference.set(user).addOnSuccessListener(new OnSuccessListener<Void>() {
                                @Override
                                public void onSuccess(Void aVoid) {
                                    Log.d("TAG","onSuccess : user profile is created for"+ userID);
                                }
                            });
                            //save image to database
                            StorageReference mStorage = FirebaseStorage.getInstance().getReference().child("users photo");
                            final StorageReference imageFilePath = mStorage.child(pickedImgUri.getLastPathSegment());
                            imageFilePath.putFile(pickedImgUri).addOnSuccessListener(new OnSuccessListener<UploadTask.TaskSnapshot>() {
                                @Override
                                public void onSuccess(UploadTask.TaskSnapshot taskSnapshot) {
                                    imageFilePath.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                                        @Override
                                        public void onSuccess(Uri uri) {
                                            UserProfileChangeRequest profilUpdate = new UserProfileChangeRequest.Builder()
                                                    .setDisplayName(username)
                                                    .setPhotoUri(uri)
                                                    .build();
                                            fAuth.getCurrentUser().updateProfile(profilUpdate).addOnSuccessListener(new OnSuccessListener<Void>() {
                                                @Override
                                                public void onSuccess(Void aVoid) {
                                                    Toast.makeText(Register.this, "Registrasi Berhasil", Toast.LENGTH_SHORT).show();
                                                    startActivity(new Intent(getApplicationContext(), MainActivity.class));
                                                }
                                            });

                                        }
                                    });
                                }
                            });


                        }

                        else {
                            Toast.makeText(Register.this, "Eror !!!" + task.getException().getMessage(), Toast.LENGTH_SHORT).show();

                        }
                    }
                });

            }

        });

    }

    private void openGallery(){
        Intent galleryintent = new Intent(Intent.ACTION_GET_CONTENT);
        galleryintent.setType("image/*");
        startActivityForResult(galleryintent,REQUESCODE);

    }

    private void checkandRequestForPermission(){
        if (ContextCompat.checkSelfPermission(Register.this, Manifest.permission.READ_EXTERNAL_STORAGE)
            != PackageManager.PERMISSION_GRANTED){
            if (ActivityCompat.shouldShowRequestPermissionRationale(Register.this, Manifest.permission.READ_EXTERNAL_STORAGE)){
             Toast.makeText(Register.this,"Place accapted the required permission", Toast.LENGTH_SHORT).show();
            }
            else{
                ActivityCompat.requestPermissions(Register.this,new String[]{Manifest.permission.READ_EXTERNAL_STORAGE},PReqCode);
            }
        }
        else{
            openGallery();
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (resultCode == RESULT_OK && requestCode == REQUESCODE && data != null){
            pickedImgUri = data.getData();
            imgUser.setImageURI(pickedImgUri);
        }
    }
}
