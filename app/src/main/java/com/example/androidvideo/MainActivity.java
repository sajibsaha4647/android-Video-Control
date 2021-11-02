package com.example.androidvideo;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    private VideoView videoView ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        videoView = findViewById(R.id.VideoViewID);

        Uri uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.sajib);

        videoView.setVideoURI(uri);


        MediaController mediaController = new MediaController(MainActivity.this);
        videoView.setMediaController(mediaController);
        videoView.start();
    }
}