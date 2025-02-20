package com.example.bookapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class Books extends AppCompatActivity {

    private LinearLayout img1, img2, img3, img4;
    private LinearLayout day1, day2, day3, day4;
    private LinearLayout pic1, pic2, pic3, pic4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        initBinding();

        img1.setOnClickListener(v -> {
            Intent intent = new Intent(Books.this, HomeScreen.class);
            intent.putExtra("image",R.drawable.img1);
            startActivity(intent);
        });

        img2.setOnClickListener(v -> {
            Intent intent = new Intent(Books.this, HomeScreen.class);
            intent.putExtra("image",R.drawable.one);
            startActivity(intent);
        });

        img3.setOnClickListener(v -> {
            Intent intent = new Intent(Books.this, HomeScreen.class);
            intent.putExtra("image",R.drawable.img3);
            startActivity(intent);
        });

        img4.setOnClickListener(v -> {
            Intent intent = new Intent(Books.this, HomeScreen.class);
            intent.putExtra("image",R.drawable.img4);
            startActivity(intent);
        });

        day1.setOnClickListener(v -> {
            Intent intent = new Intent(Books.this, HomeScreen.class);
            intent.putExtra("image",R.drawable.day1);
            startActivity(intent);
        });

        day2.setOnClickListener(v -> {
            Intent intent = new Intent(Books.this, HomeScreen.class);
            intent.putExtra("image",R.drawable.day4);
            startActivity(intent);
        });

        day3.setOnClickListener(v -> {
            Intent intent = new Intent(Books.this, HomeScreen.class);
            intent.putExtra("image",R.drawable.day3);
            startActivity(intent);
        });

        day4.setOnClickListener(v -> {
            Intent intent = new Intent(Books.this, HomeScreen.class);
            intent.putExtra("image",R.drawable.day5);
            startActivity(intent);
        });

        pic1.setOnClickListener(v -> {
            Intent intent = new Intent(Books.this, HomeScreen.class);
            intent.putExtra("image",R.drawable.pic1);
            startActivity(intent);
        });

        pic2.setOnClickListener(v -> {
            Intent intent = new Intent(Books.this, HomeScreen.class);
            intent.putExtra("image",R.drawable.pic2);
            startActivity(intent);
        });

        pic3.setOnClickListener(v -> {
            Intent intent = new Intent(Books.this, HomeScreen.class);
            intent.putExtra("image",R.drawable.pic3);
            startActivity(intent);
        });

        pic4.setOnClickListener(v -> {
            Intent intent = new Intent(Books.this, HomeScreen.class);
            intent.putExtra("image",R.drawable.pic4);
            startActivity(intent);
        });
    }

    public void initBinding(){

        img1 = findViewById(R.id.img1);
        img2 = findViewById(R.id.one);
        img3 = findViewById(R.id.img3);
        img4 = findViewById(R.id.img4);

        day1 = findViewById(R.id.day1);
        day2 = findViewById(R.id.day2);
        day3 = findViewById(R.id.day3);
        day4 = findViewById(R.id.day4);

        pic1 = findViewById(R.id.pic1);
        pic2 = findViewById(R.id.pic2);
        pic3 = findViewById(R.id.pic3);
        pic4 = findViewById(R.id.pic4);
    }
}