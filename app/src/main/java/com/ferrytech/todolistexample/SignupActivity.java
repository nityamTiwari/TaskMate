package com.ferrytech.todolistexample;

import android.content.Intent;
import android.os.Bundle;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;
import com.google.firebase.auth.FirebaseAuth;

public class SignupActivity extends AppCompatActivity {

    EditText email, password;
    Button signup;
    FirebaseAuth auth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        auth = FirebaseAuth.getInstance();

        TextView loginText = findViewById(R.id.loginText);

        email = findViewById(R.id.email);
        password = findViewById(R.id.password);
        signup = findViewById(R.id.signupBtn);



        loginText.setOnClickListener(v -> {
            startActivity(new Intent(SignupActivity.this, LoginActivity.class));
            finish();
        });

        signup.setOnClickListener(v -> {
            auth.createUserWithEmailAndPassword(
                    email.getText().toString(),
                    password.getText().toString()
            ).addOnSuccessListener(authResult -> {
                Toast.makeText(this, "Account Created", Toast.LENGTH_SHORT).show();
                finish();
            }).addOnFailureListener(e ->
                    Toast.makeText(this, e.getMessage(), Toast.LENGTH_SHORT).show()
            );
        });
    }
}
