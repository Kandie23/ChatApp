package com.example.chatapp;

public class ChatModel {
    private int image;
    private String name;
    private String inbox;

    public ChatModel(String name, int image, String inbox) {
        this.name = name;
        this.image = image;
        this.inbox = inbox;

    }

    public int getImage() {
        return image;
    }

    public String getName() {
        return name;
    }

    public String getInbox() {
        return inbox;
    }
}


