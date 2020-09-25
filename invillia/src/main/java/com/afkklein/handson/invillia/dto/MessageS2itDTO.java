package com.afkklein.handson.invillia.dto;

public class MessageS2itDTO {
    private String message;
    private int s2itport;

    public MessageS2itDTO() {
    }

    public MessageS2itDTO(String message, int s2itport) {
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
