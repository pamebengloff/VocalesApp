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

public class o_test extends AppCompatActivity {

    ImageButton oso;
    ImageButton oreja;
    ImageButton arbol;
    ImageButton hotel;
    MediaPlayer orejasound;
    MediaPlayer ososound;
    MediaPlayer errorsound;
    MediaPlayer inicio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_o_test);

        oso = (ImageButton) findViewById(R.id.iboso);
        oreja = (ImageButton) findViewById(R.id.iboido);
        arbol = (ImageButton) findViewById(R.id.arbolo);
        hotel = (ImageButton) findViewById(R.id.ibhotel);

        orejasound = MediaPlayer.create(this, R.raw.oreja_sound);
        ososound = MediaPlayer.create(this, R.raw.oso_sound);
        errorsound = MediaPlayer.create(this, R.raw.sound_error2);
        inicio = MediaPlayer.create(this, R.raw.vocalo_sound);
    }
    public void indicacioneso(View view){
        inicio.start();

    }
    public void erroro(View view){
        errorsound.start();
    }
    public  void metodoso(View view){
        ososound.start();
        Intent intent = new Intent(this, u_test.class);
        startActivity(intent);

    }
    public  void orejametod(View view){
        orejasound.start();
        Intent intent = new Intent(this, u_test.class);
        startActivity(intent);
    }
    }


