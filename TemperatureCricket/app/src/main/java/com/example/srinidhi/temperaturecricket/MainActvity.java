package com.example.srinidhi.temperaturecricket;

import android.opengl.Visibility;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActvity extends AppCompatActivity {

    EditText etValue;
    Button btnTempC;
    TextView tvResults;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_actvity);

        etValue=findViewById(R.id.etValue);
        btnTempC=findViewById(R.id.btntempC);
        tvResults=findViewById(R.id.tvResults);

        tvResults.setVisibility(View.GONE);

        btnTempC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int chirps=Integer.parseInt(etValue.getText().toString());

                double temp=(chirps/3.0)+4;


                tvResults.setText("The approx Temperature is "+temp +"Celsius");

                tvResults.setVisibility(View.VISIBLE);

            }
        });

    }


}
