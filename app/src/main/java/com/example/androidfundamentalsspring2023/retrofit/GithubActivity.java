package com.example.androidfundamentalsspring2023.retrofit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.example.androidfundamentalsspring2023.R;

import java.util.List;

public class GithubActivity extends AppCompatActivity {
    private UsersRepository usersRepository;
    private IssuesRepository issuesRepository;

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

        issuesRepository = IssuesRepository.getInstance();
        String usernameOwner = "magdamiu";
        String repoName = "AndroidFundamentalsSpring2023";
        String token = "Bearer <insert-your-token-here>";
        Issue issue = new Issue();
        issue.setTitle("An issue sent from Android code with Retrofit");
        issue.setBody("This is the body, also sent from Android with Retrofit");

        issuesRepository.postIssue(new OnPostIssueCallback() {
            @Override
            public void onSuccess(Issue issue) {
                Log.e("New Issue", issue.toString());

            }

            @Override
            public void onError() {
                Toast.makeText(GithubActivity.this, "[ISSUE] An error has occurred. Please try again later", Toast.LENGTH_LONG).show();
            }
        }, usernameOwner, repoName, token, issue);
    }
}