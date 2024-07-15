// MainActivity.java
package com.example.wisata;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // Pastikan ini sesuai dengan nama file layout XML Anda

        // Periksa apakah layout diinflasi dengan benar
        View rootView = findViewById(android.R.id.content);
        if (rootView == null) {
            Log.e(TAG, "Root view is null, layout not inflated correctly");
            return;
        }

        Button button1 = findViewById(R.id.button1); // Pastikan ID ini sesuai dengan yang ada di layout XML
        if (button1 != null) {
            button1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // Lakukan sesuatu saat tombol diklik
                }
            });
        } else {
            Log.e(TAG, "Button with ID button1 not found in layout");
        }
    }
}
