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

public class a_test extends AppCompatActivity {

    ImageButton abeja;
    ImageButton arbol;
    ImageButton perro;
    ImageButton hotel;

    MediaPlayer mpabeja;
    MediaPlayer mparbol;
    MediaPlayer error;
    MediaPlayer indicacionesa;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a_test);
        abeja = (ImageButton) findViewById(R.id.ibabeja);
        arbol = (ImageButton) findViewById(R.id.ibarbol);
        perro = (ImageButton) findViewById(R.id.ibperro);
        hotel = (ImageButton) findViewById(R.id.ibhotel);

        mpabeja = MediaPlayer.create(this, R.raw.sound_abeja);
        mparbol = MediaPlayer.create(this, R.raw.sound_arbol);
        error = MediaPlayer.create(this, R.raw.sound_error2);
        indicacionesa = MediaPlayer.create(this, R.raw.vocala_sound);


    }
    public  void  indicacionea(View view){
        indicacionesa.start();

    }

   public void abeja(View view){
        mpabeja.start();
        Intent intent  = new Intent(this, e_test.class);
        startActivity(intent);

    }
    public void errormain(View view){
        error.start();

    }
    public void arbol(View view){
        mparbol.start();
        Intent intent  = new Intent(this, e_test.class);
        startActivity(intent);



    }



}
