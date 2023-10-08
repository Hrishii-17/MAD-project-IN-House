package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        if(getSupportActionBar()!=null){

            getSupportActionBar().hide();
        }
    }

    public void onClickLeak(View v){
        Intent i = new Intent(this,MainActivity10.class);
        startActivity(i);
    }

    public void onClickDrain(View v){
        Intent i = new Intent(this,MainActivity10.class);
        startActivity(i);
    }

    public void onClickFaucet(View v){
        Intent i = new Intent(this,MainActivity10.class);
        startActivity(i);
    }

    public void onClickToilet(View v){
        Intent i = new Intent(this,MainActivity10.class);
        startActivity(i);
    }



}