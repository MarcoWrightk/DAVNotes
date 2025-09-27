package com.davnotes.model;

public class Note {
    private String id;
    private String audioBase64;
    private String sketchBase64;
    private String timestamp;

    // Constructors
    public Note() {}

    public Note(String id, String audioBase64, String sketchBase64, String timestamp) {
        this.id = id;
        this.audioBase64 = audioBase64;
        this.sketchBase64 = sketchBase64;
        this.timestamp = timestamp;
    }

    // Getters and setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getAudioBase64() { return audioBase64; }
    public void setAudioBase64(String audioBase64) { this.audioBase64 = audioBase64; }

    public String getSketchBase64() { return sketchBase64; }
    public void setSketchBase64(String sketchBase64) { this.sketchBase64 = sketchBase64; }

    public String getTimestamp() { return timestamp; }
    public void setTimestamp(String timestamp) { this.timestamp = timestamp; }
}

