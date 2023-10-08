package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import android.window.SplashScreen;

public class splashscreen extends AppCompatActivity {

    private static int SPLASH_SCREEN = 5000;

    Animation topanim,bottomanim;
    ImageView image;
    TextView logo;


    @SuppressLint({"ResourceType", "MissingInflatedId"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splashscreen);


        if(getSupportActionBar()!=null){

            getSupportActionBar().hide();
        }

        topanim = AnimationUtils.loadAnimation(this,R.anim.topanim);
        bottomanim = AnimationUtils.loadAnimation(this,R.anim.bottomanim);

        image = findViewById(R.id.imageView);
        logo = findViewById(R.id.textView);

        image.setAnimation(topanim);
        logo.setAnimation(bottomanim);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(splashscreen.this, MainActivity7.class);
                startActivity(intent);
                finish();

            }


        }, SPLASH_SCREEN);

    }
}