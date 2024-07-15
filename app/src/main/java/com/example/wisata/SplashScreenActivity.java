package com.example.wisata;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;

public class SplashScreenActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        // Duration of the splash screen display
        int SPLASH_SCREEN_DURATION = 2000; // 2 seconds

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // Start the login activity
                Intent intent = new Intent(SplashScreenActivity.this, Login.class);
                startActivity(intent);
                finish();
            }
        }, SPLASH_SCREEN_DURATION);
    }
}
