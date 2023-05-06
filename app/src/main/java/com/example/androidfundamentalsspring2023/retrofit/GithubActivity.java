package com.example.androidfundamentalsspring2023.retrofit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.example.androidfundamentalsspring2023.R;

import java.util.List;

public class GithubActivity extends AppCompatActivity {

    private UsersRepository usersRepository;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_github);

        usersRepository = UsersRepository.getInstance();
        usersRepository.getUsers(new OnGetUsersCallback() {
            @Override
            public void onSuccess(List<User> users) {
                Log.e("Users=", users.toString());
            }

            @Override
            public void onError() {
                Toast.makeText(GithubActivity.this, "An error has occurred. Please try again later", Toast.LENGTH_LONG).show();
            }
        });
    }
}