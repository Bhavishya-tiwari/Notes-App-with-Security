package com.example.notes.service;

import com.example.notes.model.Note;
import com.example.notes.repository.NotesRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface NotesService {
    Note createNoteForUser (String username, String content) ;
    Note updateNoteForUser(Long noteId, String content, String username);
    void deleteNoteForUser(Long noteId, String username) ;
    List<Note> getNotesForUser(String username) ;
}
