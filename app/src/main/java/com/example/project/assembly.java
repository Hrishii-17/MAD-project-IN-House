package com.example.project;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class assembly extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assembly);

        if(getSupportActionBar()!=null){

            getSupportActionBar().hide();
        }


        VideoView videoView5 = findViewById(R.id.assembly_book);
        VideoView videoView6 = findViewById(R.id.assembly_fan);



        String videoPath5 = "android.resource://" + getPackageName() + "/" + R.raw.v5;
        String videoPath6 = "android.resource://" + getPackageName() + "/" + R.raw.v6;





        Uri uri5 = Uri.parse(videoPath5);
        videoView5.setVideoURI(uri5);
        Uri uri6 = Uri.parse(videoPath6);
        videoView6.setVideoURI(uri6);

        MediaController mediaController5 = new MediaController(this);
        videoView5.setMediaController(mediaController5);
        mediaController5.setAnchorView(videoView5);
        MediaController mediaController6 = new MediaController(this);
        videoView6.setMediaController(mediaController6);
        mediaController6.setAnchorView(videoView6);
    }
}

