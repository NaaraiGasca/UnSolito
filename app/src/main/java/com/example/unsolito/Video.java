package com.example.unsolito;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.VideoView;

public class Video extends AppCompatActivity {

    private Button btnPlay, btnPause, btnStop, btnSalir;
    private VideoView video;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);

        video=(VideoView) findViewById(R.id.VideoView);
        String path = "android.resource://" + getPackageName() + "/" + R.raw.amiguis;
        video.setVideoURI(Uri.parse(path));

        btnPause = findViewById(R.id.buttonPause);
        btnPlay = findViewById(R.id.buttonPlay);


        btnPause.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                video.pause();
            }
        });
        btnPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                video.start();
            }
        });
    }
}