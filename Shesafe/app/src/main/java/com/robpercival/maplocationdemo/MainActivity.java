package com.robpercival.maplocationdemo;

import android.app.Activity;
import android.content.Intent;
import android.hardware.SensorListener;
import android.hardware.SensorManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.view.KeyEvent;



public class MainActivity extends AppCompatActivity {

    Button b1,b2,b3;
    RelativeLayout relativeLayout;
    int i;
    String text1="I am in danger. I need help. Plese follow my location:";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = (Button) findViewById(R.id.button1);
        b2 = (Button)findViewById(R.id.b2);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent6 = new Intent(MainActivity.this, MapsActivity.class);
                startActivity(intent6);

            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);

            }
        });
        i=0;
        relativeLayout = (RelativeLayout) findViewById(R.id.bg);
        relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i++;
                if (i == 4) {
                    i = 0;
                    Intent myintent = new Intent(MainActivity.this, MapsActivity.class);
                    myintent.putExtra("name", text1);

                    startActivity(myintent);


                }
            }
        });}
    int t=0;
        public boolean onKeyDown(int keyCode, KeyEvent event) {

            if ((keyCode == KeyEvent.KEYCODE_VOLUME_DOWN)){
                t++;
                if(t==2)
                {
                    t=0;
                    Intent myintent =new Intent(MainActivity.this,MapsActivity.class);
                    myintent.putExtra("name", text1);
                    startActivity(myintent);
                }

            }
            return super.onKeyDown(keyCode, event);
        }






    }





