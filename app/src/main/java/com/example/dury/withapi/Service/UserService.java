package com.example.dury.withapi.Service;


import com.example.dury.withapi.Model.User;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;
public interface UserService {
    @POST("/api/v1/users")
    Call<User> addUser(@Body User user);

    @FormUrlEncoded
    @POST("/api/v1/login")
    Call<String> loginUser(
            @Field("username") String username,
            @Field("password") String password
    );

}
