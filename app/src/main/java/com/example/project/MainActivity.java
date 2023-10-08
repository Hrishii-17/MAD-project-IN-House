package com.example.project;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    ViewPager2 viewPager2;
    ArrayList<ViewPagerItem> viewPagerItemArrayList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        viewPager2 = findViewById(R.id.viewpager);


        int[] images = {R.drawable.c,R.drawable.c1,R.drawable.e,R.drawable.p,R.drawable.c};

        viewPagerItemArrayList = new ArrayList<>();

        for (int i =0; i< images.length ; i++){

            ViewPagerItem viewPagerItem = new ViewPagerItem(images[i]);
            viewPagerItemArrayList.add(viewPagerItem);

        }

        VPAdapter vpAdapter = new VPAdapter(viewPagerItemArrayList);

        viewPager2.setAdapter(vpAdapter);

        viewPager2.setClipToPadding(false);

        viewPager2.setClipChildren(false);

        viewPager2.setOffscreenPageLimit(2);

        viewPager2.getChildAt(0).setOverScrollMode(View.OVER_SCROLL_NEVER);






        if(getSupportActionBar()!=null){

            getSupportActionBar().hide();
        }


    }

    public void onClickPlumber(View v) {
        Intent i = new Intent(this, MainActivity2.class);
        startActivity(i);
    }

    public void onClickElectrician(View v) {
        Intent i = new Intent(this, MainActivity3.class);
        startActivity(i);
    }

    public void onClickCleaner(View v) {
        Intent i = new Intent(this, MainActivity4.class);
        startActivity(i);

    }

    public void onClickSelfRepair(View v){
        Intent i = new Intent(this,MainActivity9.class);
        startActivity(i);
    }
}
