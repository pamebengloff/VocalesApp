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

public class Vocali extends AppCompatActivity {

    ImageButton vocaliIMG, igluIMG, iguanaIMG, islaIMG, nextIMG, menuIMG;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ivocal);

        vocaliIMG = (ImageButton) findViewById(R.id.vocaliIMG);
        igluIMG = (ImageButton) findViewById(R.id.igluIMG);
        iguanaIMG = (ImageButton) findViewById(R.id.iguanaIMG);
        islaIMG = (ImageButton) findViewById(R.id.islaIMG);
        nextIMG = (ImageButton) findViewById(R.id.nextIMG);
        menuIMG = (ImageButton) findViewById(R.id.menuIMG);

        final MediaPlayer iAudio = MediaPlayer.create(this,R.raw.vocaliaudio);
        final MediaPlayer igluAudio = MediaPlayer.create(this,R.raw.igluaudio);
        final MediaPlayer iguanaAudio = MediaPlayer.create(this,R.raw.iguanaaudio);
        final MediaPlayer islaAudio = MediaPlayer.create(this,R.raw.islaaudio);
     //   final MediaPlayer nextAudio = MediaPlayer.create(this,R.raw.nextAudio);
      //  final MediaPlayer menuAudio = MediaPlayer.create(this,R.raw.menuAudio);


        vocaliIMG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                iAudio.start();
                if(iAudio.isPlaying()){

                }else{
                    iAudio.stop();
                }
            }
        });

        iguanaIMG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                iguanaAudio.start();
                if(iguanaAudio.isPlaying()){

                }else{
                    iguanaAudio.stop();
                }
            }
        });

        islaIMG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                islaAudio.start();
                if(islaAudio.isPlaying()){

                }else{
                    islaAudio.stop();
                }
            }
        });

        igluIMG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                igluAudio.start();
                if(igluAudio.isPlaying()){

                }else{
                    igluAudio.stop();
                }
            }
        });
    }

    public void goToAtras(View view) {
        Intent intent = new Intent(this, VocalE.class);
        startActivity(intent);
    }

    public void goToNext(View view) {
        Intent intent = new Intent(this, VocalO.class);
        startActivity(intent);
    }


    public void goToMenu(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
