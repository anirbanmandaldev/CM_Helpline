package com.example.cm_helpline.ui;

import java.io.Serializable;

public class UserResponse implements Serializable {
    String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public UserResponse(String message) {
        this.message = message;
    }
}
