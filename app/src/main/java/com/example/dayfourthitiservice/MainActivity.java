package com.example.dayfourthitiservice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnStart,btnStop,btnServiceIntent;
    Intent outIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnStart=findViewById(R.id.btn_start);
        btnStop=findViewById(R.id.btn_stop);
        btnServiceIntent=findViewById(R.id.btn_service_intent);

        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                outIntent=new Intent(MainActivity.this,StartedService.class);
                startService(outIntent);
            }
        });

        btnStop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                outIntent=new Intent(MainActivity.this,StartedService.class);
                stopService(outIntent);

            }
        });

        btnServiceIntent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                outIntent=new Intent(MainActivity.this,MyIntentService.class);

            }
        });



    }
}