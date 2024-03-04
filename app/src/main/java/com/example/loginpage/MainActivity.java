package com.example.loginpage;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText emailEditText;
    private EditText passwordEditText;
    private Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize the views
        emailEditText = findViewById(R.id.editTextTextEmailAddress);
        passwordEditText = findViewById(R.id.editTextTextPassword);
        loginButton = findViewById(R.id.button);

        // Set click listener for the login button

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get the entered email and password
                String email = emailEditText.getText().toString();
                String password = passwordEditText.getText().toString();

                // Perform login authentication if needed

                // If login is successful, redirect to the new activity
                if(isValidCredentials(email,password)) {
                    Intent intent = new Intent(MainActivity.this, NewActivity.class);
                    startActivity(intent);
                }
            }
        });
    }
    private boolean isValidCredentials(String email, String password) {
        // Validate the email and password here
        // For demonstration purposes, let's say valid credentials are:
        // Email: "user@example.com" | Password: "password123"
        if(email.equals("ajay@gmail.com") && password.equals("ajay3268")){
            return true;
        }
        if(email.equals("chenna@gmail.com") && password.equals("chenna2512")){
            return true;
        }
        if(email.equals("bharath@gmail.com") && password.equals("battu")){
            return true;
        }
        if(email.equals("ramvamshi@gmail.com") && password.equals("ram123")){
            return true;
        }
        return false;
    }
}
