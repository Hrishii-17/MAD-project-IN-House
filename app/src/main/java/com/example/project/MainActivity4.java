package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity4 extends AppCompatActivity {
    public String HallCleaning;
    DBHelper DB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        DB= new DBHelper(this);



        if(getSupportActionBar()!=null){

            getSupportActionBar().hide();
        }
    }


    public void onClickHall(View v){
        Intent i = new Intent(this,MainActivity10.class);
        String orderName=HallCleaning;
        Boolean in=DB.updateOtherColumns(1,orderName);
        if(in=true){
            Toast.makeText(this,"success",Toast.LENGTH_SHORT).show();

        }
        else {
            Toast.makeText(this,"no",Toast.LENGTH_SHORT).show();

        }

        startActivity(i);
    }

    public void onClickCeil(View v){
        Intent i = new Intent(this,MainActivity10.class);
        startActivity(i);
    }

    public void onClickBath(View v){
        Intent i = new Intent(this,MainActivity10.class);
        startActivity(i);
    }
    public void onClickWindow(View v){
        Intent i = new Intent(this,MainActivity10.class);
        startActivity(i);
    }
}