package com.example.video_oynatma;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {
    VideoView videoView;
    Button baslat,durdur;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        baslat=findViewById(R.id.baslat_butonu);
        durdur=findViewById(R.id.durdur_butonu);

        videoView = (VideoView) findViewById(R.id.video_view);
        Uri adres = Uri.parse("android.resource://" + getPackageName()
                + "/"
                + R.raw.kofn);

        videoView.setVideoURI(adres);

        baslat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                videoView.start();
            }
        });
        durdur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                videoView.pause();
            }
        });
    }
}