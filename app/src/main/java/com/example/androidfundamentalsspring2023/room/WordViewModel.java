package com.example.androidfundamentalsspring2023.room;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import java.util.List;

public class WordViewModel extends AndroidViewModel {

    private WordRepository wordRepository;

    public WordViewModel(@NonNull Application application) {
        super(application);
        wordRepository = new WordRepository(application);
    }

    public void insert(Word word) {
        wordRepository.insert(word);
    }

    public LiveData<List<Word>> getAllWords() {
        return wordRepository.getAllWords();
    }
}
