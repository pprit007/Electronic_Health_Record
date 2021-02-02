package com.example.android.ehr;

import android.app.VoiceInteractor;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class OptionMain extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_option_main);

        Button editdoc, editpat;

        //editdoc=(Button)findViewById(R.id.docid);

        editpat=(Button)findViewById(R.id.patid);

            /*editdoc.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent int1=new Intent(OptionMain.this,DoctorLogin.class);
                    startActivity(int1);
                }
            });*/

        editpat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int2=new Intent(OptionMain.this,PatientLogin.class);
                startActivity(int2);
            }
        });

    }


}