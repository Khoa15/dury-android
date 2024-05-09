package com.example.dury.withapi.ViewModel;

import androidx.lifecycle.ViewModel;

import com.example.dury.withapi.Repository.UserRepository;
import com.example.dury.withapi.Model.User;

public class UserViewModel extends ViewModel {
    private UserRepository repository;

    public UserViewModel() {
        this.repository = new UserRepository();
    }

    public void addUser(User user) {
        repository.addUser(user);
    }
}
