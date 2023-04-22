package com.example.androidfundamentalsspring2023;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.URLUtil;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {
    // snake case => constante in Java si res files si valori
    // camila cu o cocoasa => nume de metode si campuri (variabile de context sau clasa)
    // camila cu doua cocoase => nume de clase

    protected static final String URL_ANDROID = "https://www.android.com/";
    private WebView webViewSample;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webViewSample = findViewById(R.id.webViewAndroid);
        webViewSample.getSettings().setJavaScriptEnabled(true);
        webViewSample.loadUrl(URL_ANDROID);

    }
}