package com.example.androidfundamentalsspring2023;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    // snake case => constante in Java si res files si valori
    // camila cu o cocoasa => nume de metode si campuri (variabile de context sau clasa)
    // camila cu doua cocoase => nume de clase

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}