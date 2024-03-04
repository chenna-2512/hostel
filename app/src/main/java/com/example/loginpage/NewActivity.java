package com.example.loginpage;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class NewActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);

        // Find the buttons by their IDs
//        Button buttonFaceId = findViewById(R.id.button2);
        Button buttonSC = findViewById(R.id.button3);
        Button buttonMess = findViewById(R.id.button4);
//        Button buttonResources = findViewById(R.id.button5);
        Button buttonComplaints = findViewById(R.id.button6);
//        Button buttonFeedback = findViewById(R.id.button7);
//        Button buttonProfile = findViewById(R.id.button8);

        // Set onClick listeners for each button
//        buttonFaceId.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                // Start the Face Id activity
//                Intent intent = new Intent(NewActivity.this, FaceIdActivity.class);
//                startActivity(intent);
//            }
//        });
//
//        buttonStudentCouncil.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                // Start the Student Council activity
//                Intent intent = new Intent(NewActivity.this, StudentCouncilActivity.class);
//                startActivity(intent);
//            }
//        });

        buttonMess.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the Mess activity
                Intent intent = new Intent(NewActivity.this, Food.class);
                startActivity(intent);
            }
        });
        buttonSC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the Mess activity
                Intent intent = new Intent(NewActivity.this, SC.class);
                startActivity(intent);
            }
        });

        buttonComplaints.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the Mess activity
                Intent intent = new Intent(NewActivity.this, Complaint.class);
                startActivity(intent);
            }
        });

        // Similarly, set onClick listeners for the rest of the buttons
        // buttonResources, buttonComplaints, buttonFeedback, buttonProfile
    }
}