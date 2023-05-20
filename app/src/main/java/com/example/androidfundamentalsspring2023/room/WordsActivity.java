package com.example.androidfundamentalsspring2023.room;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.androidfundamentalsspring2023.R;

import java.util.List;

public class WordsActivity extends AppCompatActivity {

    private TextView textViewWords;

    private WordViewModel wordViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_words);

        textViewWords = findViewById(R.id.textViewWords);

        wordViewModel = new ViewModelProvider(this).get(WordViewModel.class);
        wordViewModel.getAllWords().observe(this, words -> textViewWords.setText(words.toString()));
    }

    public void openAddWordActivityOnClick(View view) {
        Intent intent = new Intent(WordsActivity.this, AddWordActivity.class);
        startActivity(intent);
    }
}