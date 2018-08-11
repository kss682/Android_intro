package com.example.srinidhi.temperaturecricket;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    EditText edF;
    Button btnF;
    TextView tvResult2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        edF=findViewById(R.id.edF);
        btnF=findViewById(R.id.btnF);
        tvResult2=findViewById(R.id.tvResult2);

        tvResult2.setVisibility(View.GONE);

        btnF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int chirps=Integer.parseInt(edF.getText().toString());

                double Fahrenheit=chirps+40.0;

                tvResult2.setText("The approx Temperature is "+ Fahrenheit+" Fahrenheit" );

                tvResult2.setVisibility(View.VISIBLE);
            }
        });


    }
}
