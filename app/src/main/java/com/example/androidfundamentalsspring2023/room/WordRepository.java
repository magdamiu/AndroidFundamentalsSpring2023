package com.example.androidfundamentalsspring2023.room;

import android.app.Application;

import androidx.lifecycle.LiveData;

import java.util.List;

public class WordRepository {
    private WordDao wordDao;

    public WordRepository(Application application) {
        WordRoomDatabase wordRoomDatabase = WordRoomDatabase.getDatabase(application);
        wordDao = wordRoomDatabase.wordDao();
    }

    LiveData<List<Word>> getAllWords() {
        return wordDao.getAlphabetizeWords();
    }


    void insert(Word word) {
        WordRoomDatabase.databaseExecutor.execute(() -> {
            wordDao.insert(word);
        });
    }
}
