package com.example.dury.withapi.Repository;

import com.example.dury.withapi.Network.RetrofitClient;
import com.example.dury.withapi.Service.UserService;
import com.example.dury.withapi.Model.User;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class UserRepository {
    private final UserService userService;

    public UserRepository() {
        userService = RetrofitClient.getClient().create(UserService.class);
    }

    // Phương thức để thêm người dùng mới
    public void addUser(User user) {
        Call<User> call = userService.addUser(user);
        call.enqueue(new Callback<User>() {
            @Override
            public void onResponse(Call<User> call, Response<User> response) {
                System.out.println("Response: " + response);
                if (response.isSuccessful()) {
                    // Người dùng được thêm thành công
                    System.out.println("User added: " + response.body());
                } else {
                    // Xử lý lỗi, người dùng không được thêm
                    System.out.println("Failed to add user");
                }
            }

            @Override
            public void onFailure(Call<User> call, Throwable t) {
                System.out.println("Error during API request: " + t.getMessage());
            }
        });
    }

    public void loginUser(String username, String password, final Callback<String> callback) {
        Call<String> call = userService.loginUser(username, password);
        call.enqueue(new Callback<String>() {
            @Override
            public void onResponse(Call<String> call, Response<String> response) {
                if (response.isSuccessful()) {
                    // Đăng nhập thành công
                    String message = response.body();
                    if (message != null && message.equals("Login successful!")) {
                        callback.onResponse(call, Response.success("Login successful"));
                    } else {
                        callback.onFailure(call, new Throwable("Username or password does not exist"));
                    }
                } else {
                    // Xử lý lỗi, đăng nhập thất bại
                    String errorMessage = "Failed to login: " + response.errorBody().toString();
                    callback.onFailure(call, new Throwable(errorMessage));
                }
            }

            @Override
            public void onFailure(Call<String> call, Throwable t) {
                String errorMessage = "Error during API request: " + t.getMessage();
                callback.onFailure(call, new Throwable(errorMessage));
            }
        });
    }




}
