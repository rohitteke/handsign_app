package com.example.handsign_app;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Userdash extends AppCompatActivity {

    Button btndetect,btnaz,btnnumber;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_userdash);

        btndetect = findViewById(R.id.btndetection);

       btndetect.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent intent = new Intent(getApplicationContext(),signdetection.class);
               startActivity(intent);
           }
       });

        btnaz = findViewById(R.id.btnaz);

        btnaz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),a_z.class);
                startActivity(intent);
            }
        });

        btnnumber = findViewById(R.id.btnnumber);

        btnnumber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),zero.class);
                startActivity(intent);
            }
        });
    }
}