package com.example.usingvideo;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        VideoView videoView = findViewById(R.id.videoView);
        //videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.demo);
        String uri = "http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/BigBuckBunny.mp4?";
        String videoSource = "android.resource://com.example.usingvideo/" +  R.raw.demo;
        //videoView.setVideoURI(Uri.parse(videoSource));
        videoView.setVideoURI(Uri.parse(uri));

        //Медиа контроллер для управления видео
        //Элементы управления видео. Контекст - this, так как видео он будет контролировать в этом контексте
        MediaController mediaController = new MediaController(this);
        //Связываем медиаконтроллер с видео
        mediaController.setAnchorView(videoView);
        videoView.setMediaController(mediaController);

        //Автоматический запуск видео
        videoView.start();
    }
}
