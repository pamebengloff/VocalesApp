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

public class i_test extends AppCompatActivity {

    ImageButton vocali;
    ImageButton perro;
    ImageButton iglesia;
    ImageButton abeja;

    MediaPlayer sound_iglesia;
    MediaPlayer sound_vocali;
    MediaPlayer sound_error;
    MediaPlayer indicacioes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_i_test);

        abeja = (ImageButton) findViewById(R.id.abejai);
        perro =(ImageButton) findViewById(R.id.perroi);
        iglesia = (ImageButton) findViewById(R.id.ibiglesia);
        vocali = (ImageButton) findViewById(R.id.ibvocali);

        indicacioes = MediaPlayer.create(this, R.raw.sound_vocali);
        sound_iglesia = MediaPlayer.create(this, R.raw.igleisa_sound);
        sound_vocali = MediaPlayer.create(this, R.raw.sound_letrai);
        sound_error = MediaPlayer.create(this, R.raw.sound_error2);



    }
    public void indicaciones (View view){
        indicacioes.start();
    }

    public void vocali(View view){
        sound_iglesia.pause();
        sound_error.pause();
        sound_vocali.start();
        Intent intent  = new Intent(this, o_test.class);
        startActivity(intent);

    }
    public  void iglesia(View view){
        sound_vocali.pause();
        sound_error.pause();
        sound_iglesia.start();
        Intent intent  = new Intent(this, o_test.class);
        startActivity(intent);

    }
    public void errori(View view){
        sound_iglesia.pause();
        sound_vocali.pause();
        sound_error.start();
    }
}
