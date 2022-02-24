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
    String str;
    Button buttonSend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonSend =(Button) findViewById(R.id.button);
        buttonSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                RadioGroup rg = (RadioGroup) findViewById(R.id.radioGroup);
                String selectedRadioValue = ((RadioButton)findViewById(rg.getCheckedRadioButtonId() )).getText().toString();
               //RadioGroup rg = (RadioGroup) findViewById(R.id.radioGroup);
               Intent intent = new Intent(getApplicationContext(), Converter.class);
                intent.putExtra("radioGroup1Selected", selectedRadioValue);
                //int checked = rg.getCheckedRadioButtonId();
                //String selectedRadioValue = ((RadioButton)findViewById(rg.getCheckedRadioButtonId() )).getText().toString();
                //Intent intent = new Intent(MainActivity.this,Converter.class);
                //intent.putExtra("checked",checked);
                startActivity(intent);
            }
        });

    }

   // public void onRadioButtonClicked(View view) {
       // boolean checked = ((RadioButton) view).isChecked();
       // switch (view.getId()) {
          //  case R.id.radioButton:
                //if (checked)
                  //  str = "button1Text";
            //    break;
          //  case R.id.radioButton2:
               // if (checked) str = "button2Text";
              //  break;
          //  case R.id.radioButton3:
              //  if (checked) str = "button3Text";
               // break;
           // case R.id.radioButton4:
               // if (checked) str = "button4Text";
               // break;
       // }
   // }
    //

    //public void clickedButton(View view) {
      //  Intent intent = new Intent(this, Converter.class);
        //EditText choosenRadio = (EditText) findViewById(R.id.);
        //intent.putExtra("radioChosen", str);
        //startActivity(intent);
    }

