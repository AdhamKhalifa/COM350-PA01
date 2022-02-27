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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_converter);
        Intent intent = getIntent();
        String selectedRadioValue = intent.getStringExtra("selectedRadioValue");
        //String checked = intent.getStringExtra("checked");
        messageText = (TextView) findViewById(R.id.messageChange);
        messageText.setText(selectedRadioValue);
        //messageText.setText(checked);


        //messageText = (TextView) findViewById(R.id.message);
        //String message =getIntent().getExtras().getString("radioChosen");
        //messageText.setText(message);
        EditText measurementInput = (EditText) findViewById(R.id.measurement);
        String measurementValue = measurementInput.getText().toString();
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