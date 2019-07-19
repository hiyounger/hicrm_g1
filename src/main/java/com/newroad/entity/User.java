package com.newroad.entity;

public class User {
    private String user;

    public User(String user) {
        this.user = user;
    }

    public User() {
        super();
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user == null ? null : user.trim();
    }
}