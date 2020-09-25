package com.afkklein.handson.invillia.dto;

public class MessageDTO {
    private String message;
    private int s2itport;
    private int invilliaPort;

    public MessageDTO() {
    }

    public MessageDTO(String message, int s2itport, int invilliaPort) {
        this.message = message;
        this.s2itport = s2itport;
        this.invilliaPort = invilliaPort;
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

    public int getInvilliaPort() {
        return invilliaPort;
    }

    public void setInvilliaPort(int invilliaPort) {
        this.invilliaPort = invilliaPort;
    }
}
