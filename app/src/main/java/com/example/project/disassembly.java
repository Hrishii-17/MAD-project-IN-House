package com.example.project;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class disassembly extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_disassembly);

        if(getSupportActionBar()!=null){

            getSupportActionBar().hide();
        }

        VideoView videoView7 = findViewById(R.id.disassembly_lap);
        VideoView videoView8 = findViewById(R.id.disassembly_mob);



        String videoPath7 = "android.resource://" + getPackageName() + "/" + R.raw.v7;
        String videoPath8 = "android.resource://" + getPackageName() + "/" + R.raw.v8;





        Uri uri7 = Uri.parse(videoPath7);
        videoView7.setVideoURI(uri7);
        Uri uri8 = Uri.parse(videoPath8);
        videoView8.setVideoURI(uri8);

        MediaController mediaController7 = new MediaController(this);
        videoView7.setMediaController(mediaController7);
        mediaController7.setAnchorView(videoView7);
        MediaController mediaController8 = new MediaController(this);
        videoView8.setMediaController(mediaController8);
        mediaController8.setAnchorView(videoView8);
    }
}
