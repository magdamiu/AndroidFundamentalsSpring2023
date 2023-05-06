package com.example.androidfundamentalsspring2023.retrofit;

import com.squareup.picasso.BuildConfig;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class UsersRepository {
    protected static final String BASE_GITHUB_URL = "https://api.github.com/";
    private static UsersRepository usersRepository;

    private GithubApi githubApi;

    private UsersRepository(GithubApi api) {
        this.githubApi = api;
    }

    public static UsersRepository getInstance() {
        if (usersRepository == null) {
            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_GITHUB_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();

            usersRepository = new UsersRepository(retrofit.create(GithubApi.class));
        }

        return usersRepository;
    }

    public void getUsers(final OnGetUsersCallback callback) {
        githubApi.getAllUsers()
                .enqueue(new Callback<List<User>>() {
                    @Override
                    public void onResponse(Call<List<User>> call, Response<List<User>> response) {
                        if (response.isSuccessful()) {
                            List<User> users = response.body();
                            if (users != null) {
                                callback.onSuccess(users);
                            } else {
                                callback.onError();
                            }
                        } else {
                            callback.onError();
                        }
                    }

                    @Override
                    public void onFailure(Call<List<User>> call, Throwable t) {
                        callback.onError();
                    }
                });
    }
}