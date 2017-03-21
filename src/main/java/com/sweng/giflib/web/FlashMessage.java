package com.sweng.giflib.web;

/**
 * Created by ZAnwar on 3/20/2017.
 */
public class FlashMessage {
    private String Message;
    private Status status;

    public String getMessage() {
        return Message;
    }

    public Status getStatus() {
        return status;
    }

    public FlashMessage(String message, Status status) {
        Message = message;
        this.status = status;
    }

    public static enum Status {
        SUCCESS, FAILURE;
    }
}
