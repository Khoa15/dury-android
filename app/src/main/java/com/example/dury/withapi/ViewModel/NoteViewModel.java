package com.example.dury.withapi.ViewModel;

import androidx.lifecycle.ViewModel;

import com.example.dury.withapi.Model.Note;
import com.example.dury.withapi.Repository.NoteRepository;

public class NoteViewModel extends ViewModel {
    private NoteRepository repository;

    public NoteViewModel() {
        this.repository = new NoteRepository();
    }

    public void addNote(Note note) {
        repository.addNote(note);
    }
}
