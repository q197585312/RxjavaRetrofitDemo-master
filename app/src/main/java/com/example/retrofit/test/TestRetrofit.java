package com.example.retrofit.test;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Administrator on 2016/11/26 0026.
 */

public class TestRetrofit {
    private static TestRetrofit retrofitManager;
    private static Retrofit retrofit;


    public static  TestRetrofit getInstance(String baseUrl){
        if(retrofitManager ==null) {
            retrofitManager =new TestRetrofit();

        }
        retrofit = new Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        return retrofitManager;
    }
    public <T>  T getService(Class<T> classT){
        return retrofit.create(classT);
    }
}
