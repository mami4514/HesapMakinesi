package com.example.hesapmakinesi3;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


import androidx.appcompat.app.AppCompatActivity;




public class MainActivity extends AppCompatActivity {
    @SuppressLint("WrongViewCast")
    TextView display;

    @SuppressLint("WrongViewCast")
    public MainActivity() {
        display = findViewById(R.id.display);
    }


    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        display.setShowSoftInputOnFocus(false);
        display.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(getString(R.string.tap_here).equals(display.getText().toString()))
                {
                    display.setText("");
                }

            }
        });



    }
    public void anyButton(View view) {
        switch (view.getId())

        {
            case R.id.clear:display.setText(""); break;

            case R.id.square:display.setText(display.getText()+"^");    break;
            case R.id.division:display.setText(display.getText()+"/");  break;
            case R.id.one:display.setText(display.getText()+"1");       break;
            case R.id.two:display.setText(display.getText()+"2");       break;

            case R.id.three:display.setText(display.getText()+"3");      break;
            case R.id.four:display.setText(display.getText()+"4");      break;
            case R.id.five:display.setText(display.getText()+"5");      break;
            case R.id.six:display.setText(display.getText()+"6");       break;
            case R.id.eksi:display.setText(display.getText()+"-");      break;
            case R.id.seven:display.setText(display.getText()+"7");     break;
            case R.id.eight:display.setText(display.getText()+"8");     break;
            case R.id.nine:display.setText(display.getText()+"9");      break;
            case R.id.carpı:display.setText(display.getText()+"X");     break;
            case R.id.thousand:display.setText(display.getText()+"000");break;
            case R.id.zero:display.setText(display.getText()+"0");      break;
            case R.id.nokta:display.setText(display.getText()+".");     break;
            case R.id.eşittir:calculateTheResult();   break;




        }
    }
    private void calculateTheResult(){


    }

}