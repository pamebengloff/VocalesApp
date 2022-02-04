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

public class VocalO extends AppCompatActivity {

    ImageButton vocaloIMG, osoIMG, ovniIMG, ojosIMG, nextIMG, menuIMG;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ovocal);


        vocaloIMG = (ImageButton) findViewById(R.id.vocaloIMG);
        osoIMG = (ImageButton) findViewById(R.id.osoIMG);
        ovniIMG = (ImageButton) findViewById(R.id.ovniIMG);
        ojosIMG = (ImageButton) findViewById(R.id.ojosIMG);
        nextIMG = (ImageButton) findViewById(R.id.nextIMG);
        menuIMG = (ImageButton) findViewById(R.id.menuIMG);

        final MediaPlayer oAudio = MediaPlayer.create(this,R.raw.vocaloaudio);
        final MediaPlayer osoAudio = MediaPlayer.create(this,R.raw.osoaudio);
        final MediaPlayer ovniAudio = MediaPlayer.create(this,R.raw.ovniaudio);
        final MediaPlayer ojosAudio = MediaPlayer.create(this,R.raw.ojoaudio);
        //final MediaPlayer nextAudio = MediaPlayer.create(this,R.raw.nextaudio);
        //final MediaPlayer menuAudio = MediaPlayer.create(this,R.raw.menuAudio);

        vocaloIMG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                oAudio.start();
                if(oAudio.isPlaying()){

                }else{
                    oAudio.stop();
                }
            }
        });

        osoIMG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                osoAudio.start();
                if(osoAudio.isPlaying()){

                }else{
                    osoAudio.stop();
                }
            }
        });

        ojosIMG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ojosAudio.start();
                if(ojosAudio.isPlaying()){

                }else{
                    ojosAudio.stop();
                }
            }
        });

        ovniIMG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ovniAudio.start();
                if(ovniAudio.isPlaying()){

                }else{
                    ovniAudio.stop();
                }
            }
        });

    /*    nextIMG.setOnClickListener(new View.OnClickListener() {
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

    public void goToAtras(View view) {
        Intent intent = new Intent(this, Vocali.class);
        startActivity(intent);
    }
    public void goToNext(View view) {
        Intent intent = new Intent(this, VocalU.class);
        startActivity(intent);
    }

    public void goToMenu(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
