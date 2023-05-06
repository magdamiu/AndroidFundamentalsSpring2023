package com.example.androidfundamentalsspring2023.retrofit;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface GithubApi {

    @GET("/users")
    Call<List<User>> getAllUsers();

    @POST("/repos/{user}/{repo}/issues")
    Call<Issue> postIssue( @Path("user") String user,
                           @Path("repo") String repo,
                           @Header("Authorization") String token,
                           @Body Issue issue);
}
