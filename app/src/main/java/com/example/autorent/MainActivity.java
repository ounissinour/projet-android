package com.example.autorent;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Handler pour attendre 3 secondes avant de passer à MainActivity2
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // Lancer MainActivity2 après 3 secondes
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(intent);
                finish();

                // Handler pour attendre 3 secondes supplémentaires avant de passer à LoginActivity
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Intent loginIntent = new Intent(MainActivity.this, LoginActivity.class);
                        startActivity(loginIntent);
                        finish();
                    }
                }, 3000); // 3 secondes de délai pour passer à LoginActivity
            }
        }, 3000); // 3 secondes de délai initial
    }
}
