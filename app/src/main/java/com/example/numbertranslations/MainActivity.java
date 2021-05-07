package com.example.numbertranslations;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
  Button hindi,gujarati,english;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        hindi = findViewById(R.id.Hindi);
        gujarati = findViewById(R.id.Gujarati);
        english = findViewById(R.id.English);
        hindi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,HindiTranslation.class);
                startActivity(intent);
            }
        });


        gujarati.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,GujaratiTranslation.class);
                startActivity(intent);
            }
        });


        english.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,EnglishTranslation.class);
                startActivity(intent);
            }
        });


    }
}