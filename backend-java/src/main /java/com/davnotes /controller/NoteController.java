package com.davnotes.controller;

import com.davnotes.model.Note;
import com.davnotes.service.NoteService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/notes")
@CrossOrigin
public class NoteController {

    private final NoteService noteService = new NoteService();

    @PostMapping("/create")
    public Note createNote(@RequestBody Note note) {
        note.setId(UUID.randomUUID().toString());
        note.setTimestamp(String.valueOf(System.currentTimeMillis()));
        return noteService.saveNote(note);
    }

    @GetMapping("/all")
    public List<Note> getAllNotes() {
        return noteService.getAllNotes();
    }
}

