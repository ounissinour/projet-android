package com.example.autorent;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class SignUpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_up);

        // Trouver la TextView "Already registered? Login Now"
        TextView loginText = findViewById(R.id.loginText);

        // Ajouter un OnClickListener pour démarrer LoginActivity lorsque l'utilisateur clique sur cette TextView
        loginText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Lancer l'activité LoginActivity
                Intent intent = new Intent(SignUpActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });
    }
}
