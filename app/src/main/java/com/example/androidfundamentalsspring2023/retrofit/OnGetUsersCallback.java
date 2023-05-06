package com.example.androidfundamentalsspring2023.retrofit;

import java.util.List;

public interface OnGetUsersCallback {

    void onSuccess(List<User> users);

    void onError();
}