package com.example.vocalesapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton vocalesIMG, juegoIMG;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        vocalesIMG = (ImageButton) findViewById(R.id.vocalesIMG);
        juegoIMG = (ImageButton) findViewById(R.id.juegoIMG);





    }

    public void iniciarVocales(View view) {
        Intent intent = new Intent(this, VocalA.class);
        startActivity(intent);
    }

    public  void vocala(View view){
        Intent intent = new Intent(this, a_test.class);
        startActivity(intent);
}

}
