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

public class e_test extends AppCompatActivity {

    ImageButton ibescalera;
    ImageButton ibestrella;
    ImageButton indi;

    MediaPlayer soundescalera;
    MediaPlayer soundestrella;
    MediaPlayer sounderror;
    MediaPlayer indic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_e_test);

        ibescalera = (ImageButton) findViewById(R.id.ibescalera);
        ibestrella = (ImageButton) findViewById(R.id.ibestrella);
        indi = (ImageButton) findViewById(R.id.ibe);

        sounderror = MediaPlayer.create(this, R.raw.sound_error2);
        soundescalera = MediaPlayer.create(this, R.raw.sound_escalera);
        soundestrella = MediaPlayer.create(this, R.raw.sound_estrella);
        indic = MediaPlayer.create(this, R.raw.vocale_sound);
    }
    public  void indicacionese(View view){
        indic.start();
    }

    public void escalera(View view){

        soundescalera.start();
        Intent intent  = new Intent(this, i_test.class);
        startActivity(intent);

    }
    public  void estrella(View view){

        soundestrella.start();
        Intent intent  = new Intent(this, i_test.class);
        startActivity(intent);

    }
    public void error(View view){

        sounderror.start();
    }



}
