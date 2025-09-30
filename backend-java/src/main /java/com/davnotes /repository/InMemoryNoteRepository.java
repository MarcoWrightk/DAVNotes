package com.davnotes.repository;

import com.davnotes.model.Note;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class InMemoryNoteRepository {
    private final Map<String, Note> store = new ConcurrentHashMap<>();

    public Note save(Note note) {
        store.put(note.getId(), note);
        return note;
    }

    public Optional<Note> findById(String id) {
        return Optional.ofNullable(store.get(id));
    }

    public List<Note> findAll() {
        return new ArrayList<>(store.values());
    }

    public void deleteById(String id) {
        store.remove(id);
    }

    public void clear() {
        store.clear();
    }
}

