package com.example.dury.withapi.ViewModel;

import androidx.lifecycle.ViewModel;

import com.example.dury.withapi.Repository.UserRepository;
import com.example.dury.withapi.Model.User;

import retrofit2.Callback;

public class UserViewModel extends ViewModel {
    private UserRepository repository;

    public UserViewModel() {
        this.repository = new UserRepository();
    }

    public void addUser(User user) {
        repository.addUser(user);
    }

    public void loginUser(String username, String password, final Callback<String> callback) {
        repository.loginUser(username, password, callback);
    }
}
