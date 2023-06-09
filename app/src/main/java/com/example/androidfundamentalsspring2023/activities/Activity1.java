package com.example.androidfundamentalsspring2023.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.androidfundamentalsspring2023.R;

public class Activity1 extends AppCompatActivity {
    private static final String ACTIVITY_1 = "Activity1";
    protected static final String INFO = "info";

    private EditText editTextInfo;
    private Button buttonSendInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);
        Log.e(ACTIVITY_1, "onCreate");
        sampleForDebug();

        editTextInfo = findViewById(R.id.editTextInfo);
        buttonSendInfo = findViewById(R.id.buttonSendInfo);
        buttonSendInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String info = editTextInfo.getText().toString();
                if(!info.isEmpty()) {
                    Intent intent = new Intent(Activity1.this, Activity2.class);
                    intent.putExtra(INFO, info);
                    startActivity(intent);
                }
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e(ACTIVITY_1, "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e(ACTIVITY_1, "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e(ACTIVITY_1, "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e(ACTIVITY_1, "onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e(ACTIVITY_1, "onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(ACTIVITY_1, "onDestroy");
    }

    public void openActivity2OnClick(View view) {
        Intent intent = new Intent(Activity1.this, Activity2.class);
        startActivity(intent);
    }

    public void dialActionOnClick(View view) {
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:0777777777"));
        startActivity(intent);
    }

    public void openURLOnClick(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://www.google.com"));
        startActivity(intent);
    }

    public void openLocationOnClick(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("geo:0,0?q=1600+Amphitheatre+Parkway%2C+CA"));
        startActivity(intent);
    }

    private int sampleForDebug() {
        int a = 6, b = 8, c = 12;
        int sum = 1; // initially was 0 to show that we get an exception that should be debugged
        int diff = c - a;
        int div = b / sum;
        sum = a + b + c;
        return diff + div + sum;
    }
}