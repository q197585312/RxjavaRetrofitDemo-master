package com.example.retrofit.test;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ApiStores {
    @POST("index.php?page=signup_submitter")
    Call<ResponseBody> register(@Query("web_id") String web_id, @Query("useracc") String useracc,
                                @Query("password") String password, @Query("captcha") String captcha,
                                @Query("currency") String currency);
}