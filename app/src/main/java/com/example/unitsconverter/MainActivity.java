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
    public int choice;
    public int choice1 = 1;
    public int choice2 = 2;
    public int choice3 = 3;
    public int choice4 = 4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        send = (Button) findViewById(R.id.button);
        radioGroupChoice = (RadioGroup) findViewById(R.id.radioGroup);
        i = new Intent(MainActivity.this,Converter.class);

        radioGroupChoice.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {
                switch(checkedId){
                    case R.id.radioButton://
                        //i.putExtra("firstButton", choice1);
                        choice = 1;
                        break;
                    case R.id.radioButton2://Radio button id
                        //i.putExtra("secondButton", choice2);
                        choice = 2;
                        break;
                    case R.id.radioButton3://Radio button id
                        //i.putExtra("thirdButton", choice3);
                        choice = 3;
                        break;
                    case R.id.radioButton4://Radio button id
                        //i.putExtra("fourthButton", choice4);
                        choice = 4;
                        break;
                }
            }
        });
    }

        public void onClick(View view) {
            if (choice == 1) {
                i.putExtra("chosenButton", choice1);
            }if (choice == 2) {
                i.putExtra("chosenButton", choice2);
            }if (choice == 3) {
                i.putExtra("chosenButton", choice3);
            }if (choice == 4) {
                i.putExtra("chosenButton", choice4);
            }
            startActivity(i);
    }
}


