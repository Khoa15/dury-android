package com.example.dury.withapi.Repository;

import com.example.dury.withapi.Network.RetrofitClient;
import com.example.dury.withapi.Model.Note;
import com.example.dury.withapi.Service.NoteService;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class NoteRepository {
    private final NoteService noteService;

    public NoteRepository() {
        noteService = RetrofitClient.getClient().create(NoteService.class);
    }

    public void addNote(Note note) {
        Call<Note> call = noteService.addNote(note);
        call.enqueue(new Callback<Note>() {
            @Override
            public void onResponse(Call<Note> call, Response<Note> response) {
                System.out.println("Res" + response);
                if (response.isSuccessful()) {
                    // Lưu ý thành công
                    System.out.println("Note added: " + response.body());
                } else {
                    // Xử lý lỗi
                    System.out.println("Failed to add note");
                }
            }

            @Override
            public void onFailure(Call<Note> call, Throwable t) {
                System.out.println("Error during API request: " + t.getMessage());
            }
        });
    }
}


/*

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.io.IOException;

public class NoteRepository {
    private HttpClient httpClient = HttpClient.newHttpClient();

    public void addNote(Note note) {
        // Đây chỉ là một ví dụ, bạn cần thay đổi URI và body request cho phù hợp với API của bạn
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("http://example.com/api/notes"))
                .header("Content-Type", "application/json")
                .POST(HttpRequest.BodyPublishers.ofString(
                        "{\"title\":\"" + note.getTitle() + "\", \"description\":\"" + note.getDescription() + "\"}"))
                .build();

        try {
            HttpResponse<String> response = httpClient.send(request, BodyHandlers.ofString());
            System.out.println("Response status code: " + response.statusCode());
            System.out.println("Response body: " + response.body());
        } catch (IOException | InterruptedException e) {
            System.out.println("Error during API request");
            e.printStackTrace();
        }
    }
}
 */
