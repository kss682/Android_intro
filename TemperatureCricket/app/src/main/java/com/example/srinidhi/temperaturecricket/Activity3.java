package com.example.srinidhi.temperaturecricket;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Activity3 extends AppCompatActivity {

    EditText edC;
    Button btnC;
    TextView tvResult3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

        edC=findViewById(R.id.edC);
        btnC=findViewById(R.id.btnC);
        tvResult3=findViewById(R.id.tvResult3);

        tvResult3.setVisibility(View.GONE);

        btnC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int chirps= Integer.parseInt(edC.getText().toString());

                double Celsius=(chirps/3.0)+4;

                tvResult3.setText("The approx temperature is "+ Celsius+ " Celsius.");
                tvResult3.setVisibility(View.VISIBLE);


            }
        });


    }
}
