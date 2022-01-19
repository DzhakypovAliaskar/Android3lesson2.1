package com.example.android3lesson21.utils;

import android.app.Application;

import com.example.android3lesson21.data.remote.PostApi;
import com.example.android3lesson21.data.remote.RetrofitClient;

import retrofit2.Retrofit;

public class App extends Application {

    private RetrofitClient client;
    public static PostApi api;

    @Override
    public void onCreate() {
        super.onCreate();
        client = new RetrofitClient();
        api = client.provideApi();
    }
}
