package com.jsral.ha.greetings.model;

import java.util.Date;

public class Greeting {

    private Date time;
    private String message;
    private String language;

    public Greeting(String language, String message) {
        this.time = new Date();
        this.message = message;
        this.language = language;
    }

    public String getMessage() {
        return message;
    }

    public Date getTime() {
        return time;
    }

    public String getLanguage() { return language; }
}
