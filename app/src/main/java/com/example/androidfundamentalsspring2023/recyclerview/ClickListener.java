package com.example.androidfundamentalsspring2023.recyclerview;

import android.view.View;

public interface ClickListener {
    public void onClick(View view, int position);

    public void onLongClick(View view, int position);
}

