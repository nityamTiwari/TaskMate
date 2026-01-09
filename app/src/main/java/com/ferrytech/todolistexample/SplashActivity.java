package com.ferrytech.todolistexample;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(() -> {

            Intent intent;
            if (FirebaseAuth.getInstance().getCurrentUser() != null) {
                // User already logged in
                intent = new Intent(SplashActivity.this, MainActivity.class);
            } else {
                // User not logged in
                intent = new Intent(SplashActivity.this, LoginActivity.class);
            }

            startActivity(intent);
            finish();

        }, 2000);
    }
}
