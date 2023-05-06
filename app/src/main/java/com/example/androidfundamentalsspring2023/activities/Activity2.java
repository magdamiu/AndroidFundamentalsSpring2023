package com.example.androidfundamentalsspring2023.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.example.androidfundamentalsspring2023.R;

public class Activity2 extends AppCompatActivity {

    private static final String ACTIVITY_2 = "Activity2";

    private TextView textViewInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        Log.e(ACTIVITY_2, "onCreate");
        textViewInfo = findViewById(R.id.textViewInfo);
        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            String info = bundle.getString(Activity1.INFO);
            if (!info.isEmpty()) {
                textViewInfo.setText(info);
            }
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e(ACTIVITY_2, "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e(ACTIVITY_2, "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e(ACTIVITY_2, "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e(ACTIVITY_2, "onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e(ACTIVITY_2, "onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(ACTIVITY_2, "onDestroy");
    }
}