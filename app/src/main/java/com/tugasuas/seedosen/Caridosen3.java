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

public class Caridosen3 extends AppCompatActivity {

    //String[] gedung = {"Gedung 1","Gedung 2","Gedung 3","Gedung 4","Gedung 6","Gedung 7"};
    //String[] lantai = {"Lantai 1","Lantai 2","Lantai 3"};

    //Spinner sp;

    Spinner mySpinner;


    TextView judulhome;
    TextView dosen18,dosen19,dosen20;
    TextView dosen21,dosen27,dosen28,dosen29,dosen30;
    TextView dosen31,dosen32;
    TextView gedung1lantai2;

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


    //Batas Foto Dosen

    //Button mShowDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_caridosen3);
        mySpinner=(Spinner) findViewById(R.id.spinner);

        ArrayAdapter<String> myAdaptor=new ArrayAdapter<String>(Caridosen3.this,
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
                        intent = new Intent(Caridosen3.this, Caridosen2.class);
                        startActivity(intent);
                        break;
                    case 2:
                        intent = new Intent(Caridosen3.this, Caridosen3.class);
                        startActivity(intent);
                        break;
                    case 3:
                        intent = new Intent(Caridosen3.this, Caridosen4.class);
                        startActivity(intent);
                        break;
                    case 4:
                        intent = new Intent(Caridosen3.this, Caridosen5.class);
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

        gedung1lantai2=(TextView)findViewById(R.id.gedung1lantai2);

        Typeface customfontgedung1b= Typeface.createFromAsset(getAssets(),"font/font3_1.otf");
        gedung1lantai2.setTypeface(customfontgedung1b);

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
    }
}
