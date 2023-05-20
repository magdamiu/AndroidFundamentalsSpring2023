package com.example.androidfundamentalsspring2023.room;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface WordDao {
    @Insert
    void insert(Word word);

    @Query("SELECT * FROM words ORDER BY theWord ASC")
    LiveData<List<Word>> getAlphabetizeWords();

    @Query("DELETE FROM words")
    void deleteAll();
}
