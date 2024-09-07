package com.example.bmiapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        TextView finalop,bmivalue;
        Button finalsubmit;
        EditText edth, edtw, edta;
        finalop = findViewById(R.id.finalresult);
        finalsubmit = findViewById(R.id.submit);
        edth = findViewById(R.id.heightcm);
        edtw = findViewById(R.id.weightkg);
        edta = findViewById(R.id.ageyears);
        bmivalue =findViewById(R.id.bmivalue);
        finalsubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int height = Integer.parseInt(edth.getText().toString());
                int weight = Integer.parseInt(edtw.getText().toString());
                int age = Integer.parseInt(edta.getText().toString());
                int bmi = (weight * 10000) / (height * height);
                if (age < 18) { // For children and teens
                    if (bmi < 18.5) {
                        bmivalue.setText("Bmi Is "+String.valueOf(bmi));
                        finalop.setText("Underweight");
                    } else if (bmi >= 18.5 && bmi <= 24.9) {
                        bmivalue.setText("Bmi Is "+String.valueOf(bmi));
                        finalop.setText("Normal weight");
                    } else if (bmi >= 25 && bmi <= 29.9) {
                        bmivalue.setText("Bmi Is "+String.valueOf(bmi));
                        finalop.setText("Overweight");
                    } else {
                        bmivalue.setText("Bmi Is "+String.valueOf(bmi));
                        finalop.setText("Obese");
                    }
                } else if (age >= 18 && age <= 65) { // For adults
                    if (bmi < 18.5) {
                        bmivalue.setText("Bmi Is "+String.valueOf(bmi));
                        finalop.setText("Underweight");
                    } else if (bmi >= 18.5 && bmi <= 24.9) {
                        bmivalue.setText("Bmi Is "+String.valueOf(bmi));
                        finalop.setText("Normal weight");
                    } else if (bmi >= 25 && bmi <= 29.9) {
                        bmivalue.setText("Bmi Is "+String.valueOf(bmi));
                        finalop.setText("Overweight");
                    } else {
                        bmivalue.setText("Bmi Is "+String.valueOf(bmi));
                        finalop.setText("Obese");
                    }
                } else { // For older adults
                    if (bmi < 23) {
                        bmivalue.setText("Bmi Is "+String.valueOf(bmi));
                        finalop.setText("Underweight");
                    } else if (bmi >= 23 && bmi <= 28.9) {
                        bmivalue.setText("Bmi Is "+String.valueOf(bmi));
                        finalop.setText("Normal weight");
                    } else if (bmi >= 29 && bmi <= 34.9) {
                        bmivalue.setText("Bmi Is "+String.valueOf(bmi));
                        finalop.setText("Overweight");
                    } else {
                        bmivalue.setText("Bmi Is "+String.valueOf(bmi));
                        finalop.setText("Obese");
                    }
                }
            }
        });
    }
}