package com.example.androidfundamentalsspring2023.retrofit;

import com.squareup.picasso.BuildConfig;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class IssuesRepository {
    private static IssuesRepository issuesRepository;

    private GithubApi githubApi;

    private IssuesRepository(GithubApi api) {
        this.githubApi = api;
    }

    public static IssuesRepository getInstance() {
        if (issuesRepository == null) {
            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl(UsersRepository.BASE_GITHUB_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();

            issuesRepository = new IssuesRepository(retrofit.create(GithubApi.class));
        }

        return issuesRepository;
    }

    public void postIssue(final OnPostIssueCallback callback, String user, String repo, String token,
                          Issue issue) {
        githubApi.postIssue(user, repo, token, issue)
                .enqueue(new Callback<Issue>() {
                    @Override
                    public void onResponse(Call<Issue> call, Response<Issue> response) {
                        if (response.isSuccessful()) {
                            Issue issueResult = response.body();
                            if (issueResult != null) {
                                callback.onSuccess(issueResult);
                            } else {
                                callback.onError();
                            }
                        } else {
                            callback.onError();
                        }
                    }

                    @Override
                    public void onFailure(Call<Issue> call, Throwable t) {
                        callback.onError();
                    }
                });
    }
}