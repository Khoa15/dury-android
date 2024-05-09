package com.example.dury.withapi.Service;

import com.example.dury.withapi.Model.Note;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface NoteService {
    @POST("/api/v1/notes")
    Call<Note> addNote(@Body Note note);
}
