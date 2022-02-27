package com.example.unitsconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    RadioGroup radioGroupChoice;
    Button send;
    public Intent i;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int choice1 = 1;
        int choice2 = 2;
        int choice3 = 3;
        int choice4 = 4;
        send = (Button) findViewById(R.id.button);
        radioGroupChoice = (RadioGroup) findViewById(R.id.radioGroup);
        i = new Intent(MainActivity.this,Converter.class);

        radioGroupChoice.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {
                switch(checkedId){
                    case R.id.radioButton://
                        i.putExtra("firstButton", choice1);
                        break;
                    case R.id.radioButton2://Radio button id
                        i.putExtra("secondButton", choice2);
                        break;
                    case R.id.radioButton3://Radio button id
                        i.putExtra("thirdButton", choice3);
                        break;
                    case R.id.radioButton4://Radio button id
                        i.putExtra("fourthButton", choice4);
                        break;
                }
            }
        });
    }

        public void onClick(View view){
            startActivity(i);
        }



}

