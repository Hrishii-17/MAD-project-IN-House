package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);


        if(getSupportActionBar()!=null){

            getSupportActionBar().hide();
        }
    }



    public void onClickCon(View v){
        Intent i = new Intent(this,MainActivity.class);
        startActivity(i);
    }
}