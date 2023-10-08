package com.example.project;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;
import androidx.appcompat.app.AppCompatActivity;

public class devinstall extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_devinstall);

        if(getSupportActionBar()!=null){

            getSupportActionBar().hide();
        }

        VideoView videoView1 = findViewById(R.id.wall_view);
        VideoView videoView2 = findViewById(R.id.fridge_view);



        String videoPath1 = "android.resource://" + getPackageName() + "/" + R.raw.v1;
        String videoPath2 = "android.resource://" + getPackageName() + "/" + R.raw.v2;





        Uri uri1 = Uri.parse(videoPath1);
        videoView1.setVideoURI(uri1);
        Uri uri2 = Uri.parse(videoPath2);
        videoView2.setVideoURI(uri2);

        MediaController mediaController1 = new MediaController(this);
        videoView1.setMediaController(mediaController1);
        mediaController1.setAnchorView(videoView1);
        MediaController mediaController2 = new MediaController(this);
        videoView2.setMediaController(mediaController2);
        mediaController2.setAnchorView(videoView2);
    }
}
