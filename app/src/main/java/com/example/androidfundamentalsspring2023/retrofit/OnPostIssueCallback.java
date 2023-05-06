package com.example.androidfundamentalsspring2023.retrofit;

public interface OnPostIssueCallback {
    void onSuccess(Issue issue);
    void onError();
}