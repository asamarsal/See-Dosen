package com.tugasuas.seedosen;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

import java.lang.reflect.Type;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    EditText Email,Password;
    Button btnLogin;
    TextView textjudul;
    TextView textRegister;
    ProgressBar progressBar;
    FirebaseAuth mAuth;

    @BindView(R.id.logoamikom) ImageView logoamikom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textjudul=(TextView)findViewById(R.id.namaaplikasi);

        Typeface customfont= Typeface.createFromAsset(getAssets(),"font/font1.ttf");
        textjudul.setTypeface(customfont);

        Email = findViewById(R.id.inputEmail);
        Password = findViewById(R.id.inputPassword);
        btnLogin = findViewById(R.id.btnlogin);
        textRegister = findViewById(R.id.textregister);
        progressBar = findViewById(R.id.progressbar);

        //Firabase Auth
        mAuth = FirebaseAuth.getInstance();



        ButterKnife.bind(this);

        Glide.with(this)
                .load("http://amikom.ac.id/public/docs/2016/logo_amikom_full_color.png")
                .into(logoamikom);


        if (mAuth.getCurrentUser() != null){
            startActivity(new Intent(getApplicationContext(),Rumah.class));
            finish();
        }


        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = Email.getText().toString().trim();
                String password = Password.getText().toString().trim();

                if (TextUtils.isEmpty(email)) {
                    Email.setError("Email Dierlukan Bos");
                    return;
                }
                if (TextUtils.isEmpty(password)) {
                    Password.setError("Password Dibutuhkan");
                    return;
                }
                if (password.length() < 5) {
                    Password.setError("Membutuhkan 5 Karakter");
                    return;
                }

                progressBar.setVisibility(View.VISIBLE);

                //Authentification User
                mAuth.signInWithEmailAndPassword(email, password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            Toast.makeText(MainActivity.this, "Login Berhasil", Toast.LENGTH_SHORT).show();
                            startActivity(new Intent(getApplicationContext(), Rumah.class));
                        } else {
                            Toast.makeText(MainActivity.this, "Error !!!" + task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                            progressBar.setVisibility(View.GONE);
                        }
                    }
                });
            }
        });

        textRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Register.class));
            }
        });

    }
}
