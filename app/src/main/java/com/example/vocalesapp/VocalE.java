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

public class VocalE extends AppCompatActivity {

    public ImageButton vocaleIMG, elefanteIMG, eloteIMG, espadaIMG, nextIMG, menuIMG, atrasIMG;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_evocal);

        vocaleIMG = (ImageButton) findViewById(R.id.vocaleIMG);
        elefanteIMG = (ImageButton) findViewById(R.id.elefanteIMG);
        eloteIMG = (ImageButton) findViewById(R.id.eloteIMG);
        espadaIMG = (ImageButton) findViewById(R.id.espadaIMG);
        nextIMG = (ImageButton) findViewById(R.id.nextIMG);
        menuIMG = (ImageButton) findViewById(R.id.menuIMG);
        atrasIMG =(ImageButton) findViewById(R.id.atrasIMG);

        final MediaPlayer eAudio = MediaPlayer.create(this,R.raw.vocaleaudio);
        final MediaPlayer elefanteAudio = MediaPlayer.create(this,R.raw.elefanteaudio);
        final MediaPlayer eloteAudio = MediaPlayer.create(this,R.raw.eloteaudio);
        final MediaPlayer espadaAudio = MediaPlayer.create(this,R.raw.espadaaudio);
    //    final MediaPlayer nextAudio = MediaPlayer.create(this,R.raw.nextAudio);
      //  final MediaPlayer menuAudio = MediaPlayer.create(this,R.raw.menuAudio);


        vocaleIMG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                eAudio.start();
                if (eAudio.isPlaying()) {

                } else {
                    eAudio.stop();

                    // aAudio = null;
                }
            }
        });

        elefanteIMG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                elefanteAudio.start();
                if(elefanteAudio.isPlaying()){

                }else{
                    elefanteAudio.stop();
                }
            }
        });

        eloteIMG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                eloteAudio.start();
                if(eloteAudio.isPlaying()){

                }else{
                    eloteAudio.stop();
                }
            }
        });

        espadaIMG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                espadaAudio.start();
                if(espadaAudio.isPlaying()){

                }else{
                    espadaAudio.stop();
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

    }*/

  /*  public void goToAtras(View view) {
        Intent intent = new Intent(this, VocalA.class);
        startActivity(intent);
    }

    public void goToNext(View view) {
        Intent intent = new Intent(this, Vocali.class);
        startActivity(intent);
    }

    public void goToMenu(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }*/

  menuIMG.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            startActivity(new Intent(VocalE.this, MainActivity.class));

        }});

        atrasIMG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(VocalE.this, VocalA.class));

            }});

       nextIMG.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            startActivity(new Intent(VocalE.this, Vocali.class));

        }});}


}
