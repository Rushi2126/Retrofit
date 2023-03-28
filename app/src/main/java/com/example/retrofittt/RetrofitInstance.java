package com.example.retrofittt;

import static com.example.retrofittt.MainActivity.api;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitInstance {
    ApiInterface apiInterface;
    RetrofitInstance(){
        Retrofit retrofit=new Retrofit.Builder().baseUrl(api).addConverterFactory(GsonConverterFactory.create()).build();
        apiInterface=retrofit.create(ApiInterface.class);
    }
    public  static RetrofitInstance  instance;
    public static RetrofitInstance getInstance(){
        if (instance == null) {
           instance=new RetrofitInstance();
        }
        return instance;
    }
}
