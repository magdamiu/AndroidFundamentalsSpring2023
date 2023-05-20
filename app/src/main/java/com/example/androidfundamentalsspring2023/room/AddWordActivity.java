package com.example.androidfundamentalsspring2023.room;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.room.Insert;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.androidfundamentalsspring2023.R;

public class AddWordActivity extends AppCompatActivity {
    private EditText editTextWord;
    private Button buttonInsertWord;
    private WordViewModel wordViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_word);

        wordViewModel = new ViewModelProvider(this).get(WordViewModel.class);

        editTextWord = findViewById(R.id.editTextWord);
        buttonInsertWord = findViewById(R.id.buttonSave);
        buttonInsertWord.setOnClickListener(v -> {
            String word = editTextWord.getText().toString();
            wordViewModel.insert(new Word(word));
            openWordsActivity();
        });
    }

    private void openWordsActivity() {
        Intent intent = new Intent(AddWordActivity.this, WordsActivity.class);
        startActivity(intent);
    }
}