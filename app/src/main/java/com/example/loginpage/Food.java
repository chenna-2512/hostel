package com.example.loginpage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import androidx.appcompat.app.AppCompatActivity;

public class Food extends AppCompatActivity {

    private FrameLayout frameLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);

        // Find views
       // Button button9 = findViewById(R.id.button9);
       // Button button10 = findViewById(R.id.button10);
        // Initialize other buttons if present
        // Button button11 = findViewById(R.id.button11);
        // Button button12 = findViewById(R.id.button12);
        // Button button13 = findViewById(R.id.button13);
        // Button button14 = findViewById(R.id.button14);
        // Button button15 = findViewById(R.id.button15);
        //frameLayout = findViewById(R.id.frameLayout);

        // Set onClickListeners for buttons
       //// button9.setOnClickListener(this)button10.setOnClickListener(this);
        // Set onClickListeners for other buttons if present
        // button11.setOnClickListener(this);
        // button12.setOnClickListener(this);
        // button13.setOnClickListener(this);
        // button14.setOnClickListener(this);
        // button15.setOnClickListener(this);
    }

//    @Override
//    public void onClick(View view) {
//        // Update FrameLayout content based on clicked button
//        switch (view.getId()) {
//            case R.id.button9:
//                loadLayout(R.layout.layout_sun);
//                break;
//            case R.id.button10:
//                loadLayout(R.layout.layout_tue);
//                break;
//            // Add cases for other buttons if present
//        }
//    }

//    private void loadLayout(int layoutResId) {
//        // Inflate the layout and replace the content of the FrameLayout
//        LayoutInflater inflater = LayoutInflater.from(this);
//        View layout = inflater.inflate(layoutResId, frameLayout, false);
//        frameLayout.removeAllViews();
//        frameLayout.addView(layout);
//    }
}
