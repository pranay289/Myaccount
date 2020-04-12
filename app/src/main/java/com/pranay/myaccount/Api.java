package com.pranay.myaccount;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface Api {
    @FormUrlEncoded
    @POST("Register.php")
    Call<ResponseBody> createuser(
            @Field("email") String email, @Field("password") String password
    );
    @FormUrlEncoded
    @POST("Login.php")
    Call<Users> login(@Field("email") String email,@Field("password") String password);
}
