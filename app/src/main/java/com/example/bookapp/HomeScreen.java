package com.example.bookapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class HomeScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_home_screen);

        ImageView image = findViewById(R.id.imageView2);

        Intent intent = getIntent();
        int i = intent.getIntExtra("image",0);

        if (i != 0){
            image.setImageResource(i);
        }else {
            image.setImageResource(R.drawable.one);
        }
    }
}