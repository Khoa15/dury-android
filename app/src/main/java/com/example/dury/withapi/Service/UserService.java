package com.example.dury.withapi.Service;


import com.example.dury.withapi.Model.User;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;
public interface UserService {
    @POST("/api/v1/users")
    Call<User> addUser(@Body User user);
}
