package com.example.wisata;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MenuUtama extends AppCompatActivity {
    Button button1, button2, button3, button4, button5, button6;
    private static final String TAG = "MenuUtama";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_utama);

        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "button1 clicked");
                Intent intent = new Intent(MenuUtama.this, WisataAlam.class);
                finish();
                startActivity(intent);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "button2 clicked");
                Intent intent = new Intent(MenuUtama.this, Budaya.class);
                finish();
                startActivity(intent);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "button3 clicked");
                Intent intent = new Intent(MenuUtama.this, Aktivitas.class);
                finish();
                startActivity(intent);
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "button4 clicked");
                Intent intent = new Intent(MenuUtama.this, WisataKuliner.class);
                finish();
                startActivity(intent);
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "button5 clicked");
                Intent intent = new Intent(MenuUtama.this, About.class);
                finish();
                startActivity(intent);
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Log.d(TAG, "button6 clicked");
                moveTaskToBack(true);
            }
        });
    }
}
