package com.example.dury.withapi;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import com.example.dury.R;
import com.example.dury.withapi.Model.User;
import com.example.dury.withapi.ViewModel.UserViewModel;

public class UserRegistrationActivity extends AppCompatActivity {
    private UserViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_register);

        // Khởi tạo ViewModel
        viewModel = new ViewModelProvider(this).get(UserViewModel.class);

        // Thiết lập sự kiện nhấn nút để thêm User
        Button buttonSave = findViewById(R.id.buttonSave2);
        buttonSave.setOnClickListener(view -> {
            EditText editTextUserName = findViewById(R.id.editTextUserName);
            EditText editTextPassword = findViewById(R.id.editTextPassword);
            EditText editTextConfirmPassword = findViewById(R.id.etConfirmPassword);


            String username = editTextUserName.getText().toString();
            String password = editTextPassword.getText().toString();
            String confirmpassword = editTextConfirmPassword.getText().toString();
            if(!password.equals(confirmpassword)) {
                // Ví dụ hiển thị một Toast
                Toast.makeText(getApplicationContext(), "Mật khẩu xác nhận không khớp!", Toast.LENGTH_SHORT).show();
            }
            else {
                User note = new User(username, password);

                viewModel.addUser(note);
            }


        });
    }
}
