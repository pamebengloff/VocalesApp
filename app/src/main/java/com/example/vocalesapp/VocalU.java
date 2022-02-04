package com.example.vocalesapp;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.ImageButton;

public class VocalU extends AppCompatActivity {

    public ImageButton vocaluIMG, universoIMG, unoIMG, uvasIMG, nextIMG, menuIMG;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uvocal);



        vocaluIMG = (ImageButton) findViewById(R.id.vocaluIMG);
        universoIMG = (ImageButton) findViewById(R.id.universoIMG);
        unoIMG = (ImageButton) findViewById(R.id.unoIMG);

        uvasIMG = (ImageButton) findViewById(R.id.uvasIMG);
        nextIMG = (ImageButton) findViewById(R.id.nextIMG);
        menuIMG = (ImageButton) findViewById(R.id.menuIMG);

        final MediaPlayer uAudio = MediaPlayer.create(this,R.raw.vocaluaudio);
        final MediaPlayer uvasAudio = MediaPlayer.create(this,R.raw.uvasaudio);
        final MediaPlayer universoAudio = MediaPlayer.create(this,R.raw.universoaudio);
        final MediaPlayer unoAudio = MediaPlayer.create(this,R.raw.unoaudio);
      //  final MediaPlayer nextAudio = MediaPlayer.create(this,R.raw.nextAudio);
      //  final MediaPlayer menuAudio = MediaPlayer.create(this,R.raw.menuAudio);


        vocaluIMG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                uAudio.start();
                if(uAudio.isPlaying()){

                }else{
                    uAudio.stop();
                }
            }
        });

        uvasIMG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                uvasAudio.start();
                if(uvasAudio.isPlaying()){

                }else{
                    uvasAudio.stop();
                }
            }
        });

        universoIMG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                universoAudio.start();
                if(universoAudio.isPlaying()){

                }else{
                    universoAudio.stop();
                }
            }
        });

        unoIMG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                unoAudio.start();
                if(unoAudio.isPlaying()){

                }else{
                    unoAudio.stop();
                }
            }
        });
/*
        nextIMG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nextAudio.start();
                if(nextAudio.isPlaying()){

                }else{
                    nextAudio.pause();
                }




        });
*/
    }


    public void goToMenu(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    public void goToAtras(View view) {
        Intent intent = new Intent(this, VocalO.class);
        startActivity(intent);
    }

}
