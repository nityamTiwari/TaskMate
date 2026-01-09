package com.ferrytech.todolistexample;

import android.content.Intent;
import android.os.Bundle;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;

public class LoginActivity extends AppCompatActivity {

    EditText email, password;
    Button login;
    TextView signup;
    FirebaseAuth auth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        auth = FirebaseAuth.getInstance();

        email = findViewById(R.id.email);
        password = findViewById(R.id.password);
        login = findViewById(R.id.loginBtn);
        signup = findViewById(R.id.signupText);

        login.setOnClickListener(v -> {
            auth.signInWithEmailAndPassword(
                    email.getText().toString().trim(),
                    password.getText().toString().trim()
            ).addOnSuccessListener(authResult -> {

                Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(intent);
                finish();

            }).addOnFailureListener(e ->
                    Toast.makeText(this, e.getMessage(), Toast.LENGTH_SHORT).show()
            );
        });

        signup.setOnClickListener(v ->
                startActivity(new Intent(this, SignupActivity.class)));
    }
}
