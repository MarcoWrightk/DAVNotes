package com.davnotes.service;

import com.davnotes.model.Note;
import java.util.*;

public class NoteService {
    private final Map<String, Note> noteStore = new HashMap<>();

    public Note saveNote(Note note) {
        noteStore.put(note.getId(), note);
        return note;
    }

    public List<Note> getAllNotes() {
        return new ArrayList<>(noteStore.values());
    }
}

