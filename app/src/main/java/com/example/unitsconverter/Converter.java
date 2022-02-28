package com.example.unitsconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Converter extends AppCompatActivity {
    private Button gobackButton;


    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_converter);
        Intent intent = getIntent();
        EditText measurements = findViewById(R.id.inputNumber);
        TextView measureText = findViewById(R.id.messageChange);
        //EditText inputNumberVal = findViewById(R.id.inputNumber);
        EditText newInput = (EditText) findViewById(R.id.inputNumber);
        String value = newInput.getText().toString();

        TextView newView = (TextView) findViewById(R.id.ResultTextView);
        TextView ResultUnit = (TextView) findViewById(R.id.ResultUnitTextView);
        int intValue = intent.getIntExtra("chosenButton", 0);
        if (intValue == 1){
            measureText.setText("kilograms(kg) to pounds(lb)");
            measurements.setHint("Enter a measurement in kilograms(kg)");
            ResultUnit.setText("pounds(lbs)");
            Button converterBtn = findViewById(R.id.convertButton);
            converterBtn.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    String value = newInput.getText().toString();
                    Double numVal = Double.parseDouble(value);
                    numVal = numVal * 2.20462;
                    value = String.valueOf(numVal);
                    newView.setText(value);
                }
            });
        }
        if (intValue == 2){
            measureText.setText("pounds(lb) to kilograms(kg)");
            measurements.setHint("Enter a measurement in pounds(lb)");
            ResultUnit.setText("kilograms(kg)");
            Button converterBtn = findViewById(R.id.convertButton);
            converterBtn.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    String value = newInput.getText().toString();
                    Double numVal = Double.parseDouble(value);
                    numVal = numVal * 0.453592;
                    value = String.valueOf(numVal);
                    newView.setText(value);
                }
            });
        }
        if (intValue == 3){
            measureText.setText("kilometers(km) to miles(mi)");
            measurements.setHint("Enter a measurement in kilometers(km)");
            ResultUnit.setText("miles(mi)");
            Button converterBtn = findViewById(R.id.convertButton);
            converterBtn.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    String value = newInput.getText().toString();
                    Double numVal = Double.parseDouble(value);
                    numVal = numVal * 0.621371;
                    value = String.valueOf(numVal);
                    newView.setText(value);
                }
            });
        }
        if (intValue == 4){
            measureText.setText("miles(mi) to kilometers(km)");
            measurements.setHint("Enter a measurement in miles(mi)");
            ResultUnit.setText("kilometers(km)");
            Button converterBtn = findViewById(R.id.convertButton);
            converterBtn.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    String value = newInput.getText().toString();
                    Double numVal = Double.parseDouble(value);
                    numVal = numVal * 1.60934;
                    value = String.valueOf(numVal);
                    newView.setText(value);
                }
            });
        }
        if (intValue == 5){
            measureText.setText("Fahrenheit(F) to Celsius(C)");
            measurements.setHint("Enter a measurement in Fahrenheit(F)");
            ResultUnit.setText("Celsius(C)");
            Button converterBtn = findViewById(R.id.convertButton);
            converterBtn.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    String value = newInput.getText().toString();
                    Double numVal = Double.parseDouble(value);
                    numVal = ((numVal - 32) * 5)/9;
                    value = String.valueOf(numVal);
                    newView.setText(value);
                }
            });
        }




        gobackButton = findViewById(R.id.gobackButton);
        gobackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                backtoMainActivity();
            }
        });

    }



    public void backtoMainActivity(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);

    }
}