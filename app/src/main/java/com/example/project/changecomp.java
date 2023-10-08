package com.example.project;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class changecomp extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_changecomp);

        if(getSupportActionBar()!=null){

            getSupportActionBar().hide();
        }



        VideoView videoView3 = findViewById(R.id.fan_cap);
        VideoView videoView4 = findViewById(R.id.leak_tap);



        String videoPath3 = "android.resource://" + getPackageName() + "/" + R.raw.v3;
        String videoPath4 = "android.resource://" + getPackageName() + "/" + R.raw.v4;





        Uri uri3 = Uri.parse(videoPath3);
        videoView3.setVideoURI(uri3);
        Uri uri4 = Uri.parse(videoPath4);
        videoView4.setVideoURI(uri4);

        MediaController mediaController3 = new MediaController(this);
        videoView3.setMediaController(mediaController3);
        mediaController3.setAnchorView(videoView3);
        MediaController mediaController4 = new MediaController(this);
        videoView4.setMediaController(mediaController4);
        mediaController4.setAnchorView(videoView4);
    }
}