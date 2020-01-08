package com.tugasuas.seedosen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.google.firebase.auth.FirebaseAuth;

public class Rumah extends AppCompatActivity {

    TextView judulhome;
    TextView cekdosen;
    TextView chatdosen;
    TextView cekprofil;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rumah);

        judulhome=(TextView)findViewById(R.id.judulapp);

        Typeface customfont= Typeface.createFromAsset(getAssets(),"font/font3_2.otf");
        judulhome.setTypeface(customfont);

        cekdosen=(TextView)findViewById(R.id.cekdosen);

        Typeface customfont1= Typeface.createFromAsset(getAssets(),"font/font1.ttf");
        cekdosen.setTypeface(customfont1);

        chatdosen=(TextView)findViewById(R.id.chatdosen);

        Typeface customfont2= Typeface.createFromAsset(getAssets(),"font/font1.ttf");
        chatdosen.setTypeface(customfont2);

        cekprofil=(TextView)findViewById(R.id.cekprofil);

        Typeface customfont3= Typeface.createFromAsset(getAssets(),"font/font1.ttf");
        cekprofil.setTypeface(customfont3);

        //Batas..........

        LinearLayout cda = (LinearLayout) this.findViewById(R.id.cekdosenatas);
        cda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityCaridosen();
            }
        });

        LinearLayout cdb = (LinearLayout) this.findViewById(R.id.chatdosenatas);
        cdb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityChatdosen();
            }
        });

        LinearLayout cdc = (LinearLayout) this.findViewById(R.id.cekprofilatas);
        cdc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityInfoakun();
            }
        });

        /*ImageButton ibb = (ImageButton) this.findViewById(R.id.fotocekprofil);
        ibb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityInfoakun();
            }
        });
        */
    }

    public void openActivityCaridosen(){
        Intent intent = new Intent(this, Caridosen.class);
        startActivity(intent);
    }

    public void openActivityInfoakun(){
        Intent intent = new Intent(this, Infoakun.class);
        startActivity(intent);
    }

    public void openActivityChatdosen(){
        Intent intent = new Intent(this, Chatdosen.class);
        startActivity(intent);
    }

    public void logout(View view){
        FirebaseAuth.getInstance().signOut();
        Intent myIntent = new Intent(this,MainActivity.class);
        startActivity(myIntent);
        finish();

    }
}

