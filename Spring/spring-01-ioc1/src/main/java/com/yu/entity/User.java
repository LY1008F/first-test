package com.yu.entity;

public class User {
    private String username;

    public User() {
        System.out.println("user无参构造");
    }

    public void setUsername(String username) {
        this.username = username;
    }
public  void show(){
    System.out.println("username="+username);
}
}
