package com.example.admin.chat123;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;

import java.util.Date;

/**
 * Created by Admin on 12/5/2017.
 */

public class ChatMessage {
    private String messageText;
    private String messageUser;
    private long messageTime;
    FloatingActionButton fab;


    public ChatMessage(String messageText, String messageUser) {
        this.messageText = messageText;
        this.messageUser = messageUser;

        // Initialize to current time
        messageTime = new Date().getTime();
    }
    public ChatMessage(){

    }


    public String getMessageText() {
        return messageText;
    }

    public void setMessageText(String messageText) {
        this.messageText = messageText;
    }

    public String getMessageUser() {
        return messageUser;
    }

    public void setMessageUser(String messageUser) {
        this.messageUser = messageUser;
    }

    public long getMessageTime() {
        return messageTime;
    }

    public void setMessageTime(long messageTime) {
        this.messageTime = messageTime;
    }

}
