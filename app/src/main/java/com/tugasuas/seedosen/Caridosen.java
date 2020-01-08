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

public class Caridosen extends AppCompatActivity {

    //String[] gedung = {"Gedung 1","Gedung 2","Gedung 3","Gedung 4","Gedung 6","Gedung 7"};
    //String[] lantai = {"Lantai 1","Lantai 2","Lantai 3"};

    //Spinner sp;

    Spinner mySpinner;


    TextView judulhome,dosen1,dosen2,dosen3,dosen4,dosen5,dosen6,dosen7a,dosen8,dosen9,dosen10;
    TextView dosen11,dosen12,dosen13,dosen14,dosen15,dosen16,dosen17,dosen18,dosen19,dosen20;
    TextView dosen21,dosen27,dosen28,dosen29,dosen30;
    TextView dosen31,dosen32,dosen33,dosen34,dosen35,dosen36,dosen37,dosen38,dosen39,dosen40;
    TextView tekssemuadosen;

    @BindView(R.id.fotodosen1) ImageView fotodosen1;
    @BindView(R.id.fotodosen2) ImageView fotodosen2;
    @BindView(R.id.fotodosen3) ImageView fotodosen3;
    @BindView(R.id.fotodosen4) ImageView fotodosen4;
    @BindView(R.id.fotodosen5) ImageView fotodosen5;
    @BindView(R.id.fotodosen6) ImageView fotodosen6;
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
    @BindView(R.id.fotodosen18) ImageView fotodosen18;
    @BindView(R.id.fotodosen19) ImageView fotodosen19;
    @BindView(R.id.fotodosen20) ImageView fotodosen20;
    @BindView(R.id.fotodosen21) ImageView fotodosen21;
    @BindView(R.id.fotodosen27) ImageView fotodosen27;
    @BindView(R.id.fotodosen28) ImageView fotodosen28;
    @BindView(R.id.fotodosen29) ImageView fotodosen29;
    @BindView(R.id.fotodosen30) ImageView fotodosen30;
    @BindView(R.id.fotodosen31) ImageView fotodosen31;
    @BindView(R.id.fotodosen32) ImageView fotodosen32;
    @BindView(R.id.fotodosen33) ImageView fotodosen33;
    @BindView(R.id.fotodosen34) ImageView fotodosen34;
    @BindView(R.id.fotodosen35) ImageView fotodosen35;
    @BindView(R.id.fotodosen36) ImageView fotodosen36;
    @BindView(R.id.fotodosen37) ImageView fotodosen37;
    @BindView(R.id.fotodosen38) ImageView fotodosen38;
    @BindView(R.id.fotodosen39) ImageView fotodosen39;
    @BindView(R.id.fotodosen40) ImageView fotodosen40;


    //Batas Foto Dosen

    //Button mShowDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_caridosen);

        mySpinner = (Spinner) findViewById(R.id.spinner);

        ArrayAdapter<String> myAdaptor=new ArrayAdapter<String>(Caridosen.this,
                R.layout.support_simple_spinner_dropdown_item,
                getResources().getStringArray(R.array.items));

        myAdaptor.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        mySpinner.setAdapter(myAdaptor);
        mySpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

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
                        intent = new Intent(Caridosen.this, Caridosen2.class);
                        startActivity(intent);
                        break;
                    case 2:
                        intent = new Intent(Caridosen.this, Caridosen3.class);
                        startActivity(intent);
                        break;
                    case 3:
                        intent = new Intent(Caridosen.this, Caridosen4.class);
                        startActivity(intent);
                        break;
                    case 4:
                        intent = new Intent(Caridosen.this, Caridosen5.class);
                        startActivity(intent);
                        break;
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

        tekssemuadosen=(TextView)findViewById(R.id.tekssemuadosen);

        Typeface customfontsemuadosen= Typeface.createFromAsset(getAssets(),"font/font1.ttf");
        tekssemuadosen.setTypeface(customfontsemuadosen);

        dosen1=(TextView)findViewById(R.id.dosen1);

        Typeface customfont1= Typeface.createFromAsset(getAssets(),"font/font3_2.otf");
        dosen1.setTypeface(customfont);

        dosen2=(TextView)findViewById(R.id.dosen2);

        Typeface customfont2= Typeface.createFromAsset(getAssets(),"font/font3_2.otf");
        dosen2.setTypeface(customfont);

        dosen3=(TextView)findViewById(R.id.dosen3);

        Typeface customfont3= Typeface.createFromAsset(getAssets(),"font/font3_2.otf");
        dosen3.setTypeface(customfont);

        dosen4=(TextView)findViewById(R.id.dosen4);

        Typeface customfont4= Typeface.createFromAsset(getAssets(),"font/font3_2.otf");
        dosen4.setTypeface(customfont);

        dosen5=(TextView)findViewById(R.id.dosen5);

        Typeface customfont5= Typeface.createFromAsset(getAssets(),"font/font3_2.otf");
        dosen5.setTypeface(customfont);

        dosen6=(TextView)findViewById(R.id.dosen6);

        Typeface customfont6= Typeface.createFromAsset(getAssets(),"font/font3_2.otf");
        dosen6.setTypeface(customfont);

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

        dosen18=(TextView)findViewById(R.id.dosen18);

        Typeface customfont18= Typeface.createFromAsset(getAssets(),"font/font3_2.otf");
        dosen18.setTypeface(customfont);
        //............

        dosen19=(TextView)findViewById(R.id.dosen19);

        Typeface customfont19= Typeface.createFromAsset(getAssets(),"font/font3_2.otf");
        dosen19.setTypeface(customfont);
        //............

        dosen20=(TextView)findViewById(R.id.dosen20);

        Typeface customfont20= Typeface.createFromAsset(getAssets(),"font/font3_2.otf");
        dosen20.setTypeface(customfont);
        //............

        dosen21=(TextView)findViewById(R.id.dosen21);

        Typeface customfont21= Typeface.createFromAsset(getAssets(),"font/font3_2.otf");
        dosen21.setTypeface(customfont);
        //............


        dosen27=(TextView)findViewById(R.id.dosen27);

        Typeface customfont27= Typeface.createFromAsset(getAssets(),"font/font3_2.otf");
        dosen27.setTypeface(customfont);
        //............

        dosen28=(TextView)findViewById(R.id.dosen28);

        Typeface customfont28= Typeface.createFromAsset(getAssets(),"font/font3_2.otf");
        dosen28.setTypeface(customfont);
        //............

        dosen29=(TextView)findViewById(R.id.dosen29);

        Typeface customfont29= Typeface.createFromAsset(getAssets(),"font/font3_2.otf");
        dosen29.setTypeface(customfont);
        //............

        dosen30=(TextView)findViewById(R.id.dosen30);

        Typeface customfont30= Typeface.createFromAsset(getAssets(),"font/font3_2.otf");
        dosen30.setTypeface(customfont);
        //............

        dosen31=(TextView)findViewById(R.id.dosen31);

        Typeface customfont31= Typeface.createFromAsset(getAssets(),"font/font3_2.otf");
        dosen31.setTypeface(customfont);
        //............

        dosen32=(TextView)findViewById(R.id.dosen32);

        Typeface customfont32= Typeface.createFromAsset(getAssets(),"font/font3_2.otf");
        dosen32.setTypeface(customfont);
        //............

        dosen33=(TextView)findViewById(R.id.dosen33);

        Typeface customfont33= Typeface.createFromAsset(getAssets(),"font/font3_2.otf");
        dosen33.setTypeface(customfont);
        //............

        dosen34=(TextView)findViewById(R.id.dosen34);

        Typeface customfont34= Typeface.createFromAsset(getAssets(),"font/font3_2.otf");
        dosen34.setTypeface(customfont);
        //............

        dosen35=(TextView)findViewById(R.id.dosen35);

        Typeface customfont35= Typeface.createFromAsset(getAssets(),"font/font3_2.otf");
        dosen35.setTypeface(customfont);
        //............

        dosen36=(TextView)findViewById(R.id.dosen36);

        Typeface customfont36= Typeface.createFromAsset(getAssets(),"font/font3_2.otf");
        dosen36.setTypeface(customfont);
        //............

        dosen37=(TextView)findViewById(R.id.dosen37);

        Typeface customfont37= Typeface.createFromAsset(getAssets(),"font/font3_2.otf");
        dosen37.setTypeface(customfont);
        //............

        dosen38=(TextView)findViewById(R.id.dosen38);

        Typeface customfont38= Typeface.createFromAsset(getAssets(),"font/font3_2.otf");
        dosen38.setTypeface(customfont);
        //............

        dosen39=(TextView)findViewById(R.id.dosen39);

        Typeface customfont39= Typeface.createFromAsset(getAssets(),"font/font3_2.otf");
        dosen39.setTypeface(customfont);
        //............

        dosen40=(TextView)findViewById(R.id.dosen40);

        Typeface customfont40= Typeface.createFromAsset(getAssets(),"font/font3_2.otf");
        dosen40.setTypeface(customfont);
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
                .load("http://dosen.amikom.ac.id/photo/555226_1457015515.jpg")
                .into(fotodosen1);

        Glide.with(this)
                .load("http://dosen.amikom.ac.id/photo/190302034_1104724368.JPG")
                .into(fotodosen2);

        Glide.with(this)
                .load("http://dosen.amikom.ac.id/photo/14123410557211.jpg")
                .into(fotodosen3);

        Glide.with(this)
                .load("http://dosen.amikom.ac.id/photo/190302022_1317865773.jpg")
                .into(fotodosen4);

        Glide.with(this)
                .load("http://dosen.amikom.ac.id/photo/%E2%80%AA+62_812-2569-4143%E2%80%AC_20170718_092535.jpg")
                .into(fotodosen5);

        Glide.with(this)
                .load("http://dosen.amikom.ac.id/photo/aaaaaaaa.jpg")
                .into(fotodosen6);

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

        Glide.with(this)
                .load("http://dosen.amikom.ac.id/photo/555171_1347115246.jpg")
                .into(fotodosen18);

        Glide.with(this)
                .load("http://dosen.amikom.ac.id/photo/190302249_1425045717.jpg")
                .into(fotodosen19);

        Glide.with(this)
                .load("http://www.amikom.ac.id/public/images/none.jpg")
                .into(fotodosen20);

        Glide.with(this)
                .load("http://www.amikom.ac.id/public/images/none.jpg")
                .into(fotodosen21);

        Glide.with(this)
                .load("http://dosen.amikom.ac.id/photo/190302229_14361076713.jpeg")
                .into(fotodosen27);

        Glide.with(this)
                .load("http://www.amikom.ac.id/public/images/none.jpg")
                .into(fotodosen28);

        Glide.with(this)
                .load("http://dosen.amikom.ac.id/photo/nn12.jpg")
                .into(fotodosen29);

        Glide.with(this)
                .load("http://www.amikom.ac.id/public/images/none.jpg")
                .into(fotodosen30);

        Glide.with(this)
                .load("http://www.amikom.ac.id/public/images/none.jpg")
                .into(fotodosen31);

        Glide.with(this)
                .load("http://dosen.amikom.ac.id/photo/11.jpg")
                .into(fotodosen32);

        Glide.with(this)
                .load("http://www.amikom.ac.id/public/images/none.jpg")
                .into(fotodosen33);

        Glide.with(this)
                .load("http://dosen.amikom.ac.id/photo/IMG_4151.jpg")
                .into(fotodosen34);

        Glide.with(this)
                .load("http://dosen.amikom.ac.id/photo/IMG-20150316-WA00141.jpg")
                .into(fotodosen35);

        Glide.with(this)
                .load("http://dosen.amikom.ac.id/photo/itu.jpg")
                .into(fotodosen36);

        Glide.with(this)
                .load("http://dosen.amikom.ac.id/photo/ainulyaqin1.jpg")
                .into(fotodosen37);

        Glide.with(this)
                .load("http://dosen.amikom.ac.id/photo/Id_Card_Amikom_1_-_Copy1.jpg")
                .into(fotodosen38);

        Glide.with(this)
                .load("http://dosen.amikom.ac.id/photo/190302240_1426061395.jpg")
                .into(fotodosen39);

        Glide.with(this)
                .load("http://dosen.amikom.ac.id/photo/20170829_125354_-_Copy.jpg")
                .into(fotodosen40);

    }
}
