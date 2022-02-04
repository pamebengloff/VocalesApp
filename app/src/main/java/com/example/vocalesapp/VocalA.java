package com.example.vocalesapp;

import android.content.Intent;
import android.media.Image;
import android.media.MediaPlayer;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class VocalA extends AppCompatActivity {

   public ImageButton avionIMG, angelIMG, vocalaIMG, abejaIMG, nextIMG, menuIMG;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_avocal);

        avionIMG = (ImageButton) findViewById(R.id.avionIMG);
        angelIMG = (ImageButton) findViewById(R.id.angelIMG);
        vocalaIMG = (ImageButton) findViewById(R.id.vocalaIMG);
        abejaIMG = (ImageButton) findViewById(R.id.abejaIMG);
        nextIMG = (ImageButton) findViewById(R.id.nextIMG);
        menuIMG = (ImageButton) findViewById(R.id.menuIMG);

        final MediaPlayer aAudio = MediaPlayer.create(this, R.raw.vocalaaudio);
        final MediaPlayer angelAudio = MediaPlayer.create(this, R.raw.angelaudio);
        final MediaPlayer avionAudio = MediaPlayer.create(this, R.raw.avionaudio);
        final MediaPlayer abejaAudio = MediaPlayer.create(this, R.raw.abejaaudio);
   //     final MediaPlayer nextAudio = MediaPlayer.create(this, R.raw.nextAudio);
     //   final MediaPlayer menuAudio = MediaPlayer.create(this, R.raw.menuAudio);


        vocalaIMG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                aAudio.start();
                if (aAudio.isPlaying()) {

                } else {
                    aAudio.stop();

                   // aAudio = null;
                }
            }
        });

        avionIMG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                avionAudio.start();
                if (avionAudio.isPlaying()) {

                } else {
                    avionAudio.stop();

                }
            }
        });

        angelIMG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                angelAudio.start();
                if (angelAudio.isPlaying()) {

                } else {
                    angelAudio.stop();

                }
            }
        });

        abejaIMG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abejaAudio.start();
                if (abejaAudio.isPlaying()) {

                } else {
                    abejaAudio.stop();


                }
            }
        });

        menuIMG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();

        }});

       nextIMG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(VocalA.this, VocalE.class));

            }});}



   /* public void goToNext(View view) {
        //Intent intent = new Intent(VocalA.this, VocalE.class);
        //startActivity(intent);
        startActivity(new Intent(VocalA.this, VocalE.class));*/
    }






