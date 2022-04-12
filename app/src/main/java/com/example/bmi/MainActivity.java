package com.example.bmi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText height,weight,health,health2;
    Button calculate;

    float e_hight, e_weight, m=1, ans;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        height = findViewById(R.id.e_hight);
        weight = findViewById(R.id.e_weight);
        calculate = findViewById(R.id.calculate);
        health = findViewById(R.id.health);

        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                e_hight = Float.parseFloat(height.getText().toString());
                e_weight = Float.parseFloat(weight.getText().toString());

                float h = e_hight/100;

                ans = e_weight / (h * h);

                if(ans<18.5){
                    health.setText("Under Weight");
                    health2.setText("health : " + ans);
                }else if(ans>=18.5 && ans<25){
                    health.setText("Normal Weight");
                    health2.setText("health : " + ans);
                }else if(ans>=25 && ans<30){
                    health.setText("Over Weight");
                    health2.setText("health : " + ans);
                }
                else{
                    health.setText("Obesity");
                    health2.setText("health : " + ans);
                }
            }
        });

    }
}