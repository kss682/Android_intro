package com.example.srinidhi.temperaturecricket;

import android.content.Intent;
import android.net.Uri;
import android.opengl.Visibility;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActvity extends AppCompatActivity {


    Button btnTempC;
    Button btnTempF;
    Button btnWeb;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_actvity);


        btnTempC=findViewById(R.id.btnTempC);
        btnTempF=findViewById(R.id.btnTempF);
        btnWeb=findViewById(R.id.btnWeb);




        btnTempF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(MainActvity.this,
                        com.example.srinidhi.temperaturecricket.Activity2.class);
                startActivity(intent);
            }
        });


        btnTempC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActvity.this,
                        com.example.srinidhi.temperaturecricket.Activity3.class);
                startActivity(intent);
            }
        });


        btnWeb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.almanac.com/content/predict-temperature-cricket-chirps"));
                startActivity(intent);
            }
        });


    }


}
