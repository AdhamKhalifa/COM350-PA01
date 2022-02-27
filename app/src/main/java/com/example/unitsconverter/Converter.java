package com.example.unitsconverter;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

import android.os.Bundle;

public class Converter extends AppCompatActivity {
    TextView messageText;
    private Button gobackButton;
    Intent myIntent = getIntent();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_converter);
        Intent intent = getIntent();
        EditText measurments = (EditText) findViewById(R.id.measurementEnter);
        TextView measureText = (TextView) findViewById(R.id.messageChange);
        int intValue = intent.getIntExtra("chosenButton", 0);
        if (intValue == 1){
            measureText.setText("kilograms(kg) to pounds(lb)");
            measurments.setHint("Enter a measurement in kilograms(kg)");
        }
        if (intValue == 2){
            measureText.setText("pounds(lb) to kilograms(kg)");
            measurments.setHint("Enter a measurement in pounds(lb)");
        }
        if (intValue == 3){
            measureText.setText("kilometers(km) to miles(mi)");
            measurments.setHint("Enter a measurement in kilometers(km)");
        }
        if (intValue == 4){
            measureText.setText("miles(mi) to kilometers(km)");
            measurments.setHint("Enter a measurement in miles(mi)");
        }




        gobackButton = (Button) findViewById(R.id.gobackButton);
        gobackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                backtoMainActivity();
            }
        });

        Button converterBtn = (Button) findViewById(R.id.convertButton);
        converterBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click

            }
        });
    }



    public void backtoMainActivity(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);

    }
}