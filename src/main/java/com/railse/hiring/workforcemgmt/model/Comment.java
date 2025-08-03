package com.railse.hiring.workforcemgmt.model;

public class Comment {
    private String user;
    private String text;
    private Long timestamp;

    // Add constructor, getters, setters if not using Lombok
    public Comment() {}
    public Comment(String user, String text, Long timestamp) {
        this.user = user;
        this.text = text;
        this.timestamp = timestamp;
    }

    public String getUser() { return user; }
    public void setUser(String user) { this.user = user; }
    public String getText() { return text; }
    public void setText(String text) { this.text = text; }
    public Long getTimestamp() { return timestamp; }
    public void setTimestamp(Long timestamp) { this.timestamp = timestamp; }
}
