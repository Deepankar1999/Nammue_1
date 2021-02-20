package com.example.nammur_public_news;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Timer timer;
        timer=new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                Intent languageActivity=new Intent(MainActivity.this,choose_Language__4.class);
                MainActivity.this.startActivity(languageActivity);
            }
        },5000);
    }
}