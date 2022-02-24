package com.example.unitsconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {
    String str;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onRadioButtonClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.radioButton:
                if (checked)
                    str = "button1Text";
                break;
            case R.id.radioButton2:
                if (checked) str = "button2Text";
                break;
            case R.id.radioButton3:
                if (checked) str = "button3Text";
                break;
            case R.id.radioButton4:
                if (checked) str = "button4Text";
                break;
        }
    }
    //

    public void clickedButton(View view) {
        Intent intent = new Intent(this, Converter.class);
        //EditText choosenRadio = (EditText) findViewById(R.id.);
        intent.putExtra("radioChosen", str);
        startActivity(intent);
    }
}
