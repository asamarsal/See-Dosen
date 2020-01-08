package com.tugasuas.seedosen;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Toolbar;

import com.bumptech.glide.Glide;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Caridosen2 extends AppCompatActivity {

    //String[] gedung = {"Gedung 1","Gedung 2","Gedung 3","Gedung 4","Gedung 6","Gedung 7"};
    //String[] lantai = {"Lantai 1","Lantai 2","Lantai 3"};

    //Spinner sp;

    Spinner mySpinner2;


    TextView judulhome,dosen7a,dosen8,dosen9,dosen10;
    TextView dosen11,dosen12,dosen13,dosen14,dosen15,dosen16,dosen17;
    TextView gedung1lantai1;

    @BindView(R.id.fotodosen7) ImageView fotodosen7;
    @BindView(R.id.fotodosen8) ImageView fotodosen8;
    @BindView(R.id.fotodosen9) ImageView fotodosen9;
    @BindView(R.id.fotodosen10) ImageView fotodosen10;
    @BindView(R.id.fotodosen11) ImageView fotodosen11;
    @BindView(R.id.fotodosen12) ImageView fotodosen12;
    @BindView(R.id.fotodosen13) ImageView fotodosen13;
    @BindView(R.id.fotodosen14) ImageView fotodosen14;
    @BindView(R.id.fotodosen15) ImageView fotodosen15;
    @BindView(R.id.fotodosen16) ImageView fotodosen16;
    @BindView(R.id.fotodosen17) ImageView fotodosen17;


    //Batas Foto Dosen

    //Button mShowDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_caridosen2);

        mySpinner2=(Spinner) findViewById(R.id.spinner2);

        ArrayAdapter<String> myAdaptor=new ArrayAdapter<String>(Caridosen2.this,
                R.layout.support_simple_spinner_dropdown_item,
                getResources().getStringArray(R.array.items2));

        myAdaptor.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        mySpinner2.setAdapter(myAdaptor);
        mySpinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            public void onClick(View v) {
                // TODO Auto-generated method stub

            }

            @Override
            public void onItemSelected(AdapterView<?> arg0, View view,
                                       int position, long row_id)
            {
                final Intent intent;
                switch(position)
                {
                    case 1:
                        intent = new Intent(Caridosen2.this, Caridosen.class);
                        startActivity(intent);
                        break;
                    case 2:
                        intent = new Intent(Caridosen2.this, Caridosen3.class);
                        startActivity(intent);
                        break;
                    case 3:
                        intent = new Intent(Caridosen2.this, Caridosen4.class);
                        startActivity(intent);
                        break;
                    case 4:
                        intent = new Intent(Caridosen2.this, Caridosen5.class);
                        startActivity(intent);
                        break;
// and so on // .....
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
                // TODO Auto-generated method stub

            }

        });


        judulhome=(TextView)findViewById(R.id.judulapp);

        Typeface customfont= Typeface.createFromAsset(getAssets(),"font/font3_2.otf");
        judulhome.setTypeface(customfont);

        gedung1lantai1=(TextView)findViewById(R.id.gedung1lantai1);

        Typeface customfontgedung1a= Typeface.createFromAsset(getAssets(),"font/font3_1.otf");
        gedung1lantai1.setTypeface(customfontgedung1a);

        dosen7a=(TextView)findViewById(R.id.dosen7a);

        Typeface customfont7= Typeface.createFromAsset(getAssets(),"font/font3_2.otf");
        dosen7a.setTypeface(customfont);

        dosen8=(TextView)findViewById(R.id.dosen8);

        Typeface customfont8= Typeface.createFromAsset(getAssets(),"font/font3_2.otf");
        dosen8.setTypeface(customfont);

        dosen9=(TextView)findViewById(R.id.dosen9);

        Typeface customfont9= Typeface.createFromAsset(getAssets(),"font/font3_2.otf");
        dosen9.setTypeface(customfont);

        dosen10=(TextView)findViewById(R.id.dosen10);

        Typeface customfont10= Typeface.createFromAsset(getAssets(),"font/font3_2.otf");
        dosen10.setTypeface(customfont);

        dosen11=(TextView)findViewById(R.id.dosen11);

        Typeface customfont11= Typeface.createFromAsset(getAssets(),"font/font3_2.otf");
        dosen11.setTypeface(customfont);

        dosen12=(TextView)findViewById(R.id.dosen12);

        Typeface customfont12= Typeface.createFromAsset(getAssets(),"font/font3_2.otf");
        dosen12.setTypeface(customfont);

        dosen13=(TextView)findViewById(R.id.dosen13);

        Typeface customfont13= Typeface.createFromAsset(getAssets(),"font/font3_2.otf");
        dosen13.setTypeface(customfont);
        //...........

        dosen14=(TextView)findViewById(R.id.dosen14);

        Typeface customfont14= Typeface.createFromAsset(getAssets(),"font/font3_2.otf");
        dosen14.setTypeface(customfont);
        //............

        dosen15=(TextView)findViewById(R.id.dosen15);

        Typeface customfont15= Typeface.createFromAsset(getAssets(),"font/font3_2.otf");
        dosen15.setTypeface(customfont);
        //............

        dosen16=(TextView)findViewById(R.id.dosen16);

        Typeface customfont16= Typeface.createFromAsset(getAssets(),"font/font3_2.otf");
        dosen16.setTypeface(customfont);
        //............

        dosen17=(TextView)findViewById(R.id.dosen17);

        Typeface customfont17= Typeface.createFromAsset(getAssets(),"font/font3_2.otf");
        dosen17.setTypeface(customfont);
        //............


        //Batas Font Dosen


        /*mShowDialog = (Button) findViewById(R.id.btnShowDialog);
        mShowDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder mBuilder = new AlertDialog.Builder(Caridosen.this);
                View mView = getLayoutInflater().inflate(R.layout.dialog_spinner, null);
                mBuilder.setTitle("Pilih Ruangan");
                Spinner mSpinner = (Spinner) mView.findViewById(R.id.spinner);
                ArrayAdapter<String> adapter = new ArrayAdapter<String>(Caridosen.this,
                        android.R.layout.simple_spinner_dropdown_item,
                        getResources().getStringArray(R.array.restaurantList));
                adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                mSpinner.setAdapter(adapter);

                mBuilder.setNegativeButton("Batalkan", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                });
                mBuilder.setView(mView);
                AlertDialog dialog = mBuilder.create();
                dialog.show();
            }
        });*/

        //sp = (Spinner)findViewById(R.id.spinnergedung);

        ButterKnife.bind(this);

        Glide.with(this)
                .load("http://dosen.amikom.ac.id/photo/555169_1381243793.jpg")
                .into(fotodosen7);

        Glide.with(this)
                .load("http://dosen.amikom.ac.id/photo/adit1.jpg")
                .into(fotodosen8);

        Glide.with(this)
                .load("http://dosen.amikom.ac.id/photo/adityary1.jpg")
                .into(fotodosen9);

        Glide.with(this)
                .load("http://dosen.amikom.ac.id/photo/555207_1394442459.jpg")
                .into(fotodosen10);

        Glide.with(this)
                .load("http://www.amikom.ac.id/public/images/none.jpg")
                .into(fotodosen11);

        Glide.with(this)
                .load("http://dosen.amikom.ac.id/photo/Foto.jpg")
                .into(fotodosen12);

        Glide.with(this)
                .load("http://www.amikom.ac.id/public/images/none.jpg")
                .into(fotodosen13);

        Glide.with(this)
                .load("http://dosen.amikom.ac.id/photo/1-Kecil.jpg")
                .into(fotodosen14);

        Glide.with(this)
                .load("http://dosen.amikom.ac.id/photo/c.jpg")
                .into(fotodosen15);

        Glide.with(this)
                .load("http://www.amikom.ac.id/public/images/none.jpg")
                .into(fotodosen16);

        Glide.with(this)
                .load("http://dosen.amikom.ac.id/photo/190302012_1277956995.JPG")
                .into(fotodosen17);

    }
}
