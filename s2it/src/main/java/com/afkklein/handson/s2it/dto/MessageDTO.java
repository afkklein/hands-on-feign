package com.afkklein.handson.s2it.dto;

public class MessageDTO {
    private String message;
    private int s2itport;

    public MessageDTO() {
    }

    public MessageDTO(String message, int s2itport) {
        this.message = message;
        this.s2itport = s2itport;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getS2itport() {
        return s2itport;
    }

    public void setS2itport(int s2itport) {
        this.s2itport = s2itport;
    }
}
