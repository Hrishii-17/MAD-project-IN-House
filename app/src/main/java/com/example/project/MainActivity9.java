package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity9 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main9);

        if(getSupportActionBar()!=null){

            getSupportActionBar().hide();
        }
    }


    public void onClick1(View v){
        Intent i = new Intent(this,assembly.class);
        startActivity(i);
    }

    public void onClick2(View v){
        Intent i = new Intent(this,changecomp.class);
        startActivity(i);
    }

    public void onClick3(View v){
        Intent i = new Intent(this,devinstall.class);
        startActivity(i);
    }

    public void onClick4(View v){
        Intent i = new Intent(this,disassembly.class);
        startActivity(i);
    }
}