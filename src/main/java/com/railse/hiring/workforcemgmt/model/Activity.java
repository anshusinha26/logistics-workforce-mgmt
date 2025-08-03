package com.railse.hiring.workforcemgmt.model;

public class Activity {
    private String message;
    private Long timestamp;

    // Add constructor, getters, setters if not using Lombok
    public Activity() {}
    public Activity(String message, Long timestamp) {
        this.message = message;
        this.timestamp = timestamp;
    }

    public String getMessage() { return message; }
    public void setMessage(String message) { this.message = message; }
    public Long getTimestamp() { return timestamp; }
    public void setTimestamp(Long timestamp) { this.timestamp = timestamp; }
}
