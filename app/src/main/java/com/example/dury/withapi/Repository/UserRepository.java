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

    // Các phương thức khác có thể bao gồm cập nhật thông tin người dùng, lấy danh sách người dùng, xóa người dùng, v.v.
}
