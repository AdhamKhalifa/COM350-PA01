package com.example.unitsconverter;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
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
        messageText = (TextView) findViewById(R.id.message);
        String message =getIntent().getExtras().getString("radioChosen");
        messageText.setText(message);

        gobackButton = (Button) findViewById(R.id.gobackButton);
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