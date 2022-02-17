package com.yu.entity;

import org.springframework.beans.factory.annotation.Autowired;

public class User {
    @Autowired
    private Cat cat;
    @Autowired
    private  Dog dog;
    private String str;

    public Cat getCat() {
        return cat;
    }

    public Dog getDog() {
        return dog;
    }


    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    @Override
    public String toString() {
        return "User{" +
                "cat=" + cat +
                ", dog=" + dog +
                ", str='" + str + '\'' +
                '}';
    }
}
