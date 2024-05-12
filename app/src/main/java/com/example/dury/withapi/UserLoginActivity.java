package com.example.dury.withapi;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import com.example.dury.R;
import com.example.dury.oldwithnoapi.NoteActivity;
import com.example.dury.withapi.Model.User;
import com.example.dury.withapi.ViewModel.UserViewModel;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class UserLoginActivity extends AppCompatActivity {
    private UserViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_login);

        // Khởi tạo ViewModel
        viewModel = new ViewModelProvider(this).get(UserViewModel.class);
        Button buttonLogin = findViewById(R.id.btnLogin);
        Button buttonRegis = findViewById(R.id.btRegister);

        buttonLogin.setOnClickListener(view -> {
            EditText editTextEmail = findViewById(R.id.etEmail);
            EditText editTextPassword = findViewById(R.id.etPassword);

            String username = editTextEmail.getText().toString();
            String password = editTextPassword.getText().toString();

            viewModel.loginUser(username, password, new Callback<String>() {
                @Override
                public void onResponse(Call<String> call, Response<String> response) {
                    // Xử lý kết quả trả về khi đăng nhập thành công
                    String message = response.body();
                    if (message != null && message.equals("Success")) {
                        // Đăng nhập thành công, thực hiện hành động cụ thể
                        Intent intent = new Intent(UserLoginActivity.this, NoteActivity.class);
                        startActivity(intent);
                        finish(); // Đóng Activity đăng nhập
                    } else {
                        // Đăng nhập không thành công, hiển thị thông báo lỗi
                        Toast.makeText(UserLoginActivity.this, "Failed to login: " + message, Toast.LENGTH_SHORT).show();
                    }
                }

                @Override
                public void onFailure(Call<String> call, Throwable t) {
                    // Xử lý lỗi khi gọi API
                    Toast.makeText(UserLoginActivity.this, "Error: " + t.getMessage(), Toast.LENGTH_SHORT).show();
                }
            });
        });

        buttonRegis.setOnClickListener(view -> {
            Intent intent = new Intent(UserLoginActivity.this, UserRegistrationActivity.class);
            startActivity(intent);
        });
    }
}

