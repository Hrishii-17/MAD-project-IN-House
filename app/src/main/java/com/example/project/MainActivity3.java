package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);


        if(getSupportActionBar()!=null){

            getSupportActionBar().hide();
        }
    }


    public void onClickLight(View v){
        Intent i = new Intent(this,MainActivity10.class);
        startActivity(i);
    }

    public void onClickPanel(View v){
        Intent i = new Intent(this,MainActivity10.class);
        startActivity(i);
    }

    public void onClickWire(View v){
        Intent i = new Intent(this,MainActivity10.class);
        startActivity(i);
    }

    public void onClickSwitch(View v){
        Intent i = new Intent(this,MainActivity10.class);
        startActivity(i);
    }



}