package com.example.retrofit.test;

import java.io.Serializable;

public class RegistInfo implements Serializable {
    String username;
    String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "RegistInfo{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}