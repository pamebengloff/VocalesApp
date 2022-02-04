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

public class u_test extends AppCompatActivity {

    ImageButton uva;
    ImageButton uno;
    ImageButton arbolu;
    ImageButton abejau;

    MediaPlayer uvaosound;
    MediaPlayer unosound;
    MediaPlayer erroru;
    MediaPlayer indicacionesound;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_u_test);
        uva = (ImageButton) findViewById(R.id.ibvua);
        uno = (ImageButton) findViewById(R.id.ibuno);
        arbolu = (ImageButton) findViewById(R.id.ibarbolu);
        abejau = (ImageButton) findViewById(R.id.abejau);

        uvaosound = MediaPlayer.create(this, R.raw.uva_sound);
        unosound = MediaPlayer.create(this, R.raw.uno_sound);
        erroru = MediaPlayer.create(this, R.raw.sound_error2);
        indicacionesound = MediaPlayer.create(this, R.raw.vocalusound);
    }
    public void indicacionesu(View view){
        indicacionesound.start();

    }
    public void erroru(View view){
        erroru.start();
    }
    public  void uvametod(View view){
        uvaosound.start();
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);

    }
    public  void unometod(View view){
        unosound.start();
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

}
