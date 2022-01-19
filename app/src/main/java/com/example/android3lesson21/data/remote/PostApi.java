package com.example.android3lesson21.data.remote;

import com.example.android3lesson21.data.models.Post;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface PostApi {

     @GET("/posts")
    Call<List<Post>> getPosts();

     @POST("/posts")
    Call<Post> createPost(
            @Body Post post
     );
}