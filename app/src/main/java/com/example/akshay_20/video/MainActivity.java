package com.example.akshay_20.video;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.VideoView;
import android.widget.MediaController;
import android.net.Uri;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MediaController vidControl = new MediaController(this);
        final VideoView videoView=(VideoView)findViewById(R.id.videoView);
        String vidaddress ="https://archive.org/download/ksnn_compilation_master_the_internet/ksnn_compilation_master_the_internet_512kb.mp4";
        Uri vidUri = Uri.parse(vidaddress);
        videoView.setVideoURI(vidUri);
        vidControl.setAnchorView(videoView);
        videoView.setMediaController(vidControl);


        videoView.start();
    }
}
