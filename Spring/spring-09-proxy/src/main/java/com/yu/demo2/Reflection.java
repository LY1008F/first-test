package com.yu.demo2;

public class Reflection {
    public static void main(String[] args) throws ClassNotFoundException {
        Class c1= Class.forName("com.yu.demo2.User");
        System.out.println(c1.hashCode());
        Class c2= Class.forName("com.yu.demo2.User");
        Class c3= Class.forName("com.yu.demo2.User");
        Class c4= Class.forName("com.yu.demo2.User");
        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c3.hashCode());
        System.out.println(c4.hashCode());
    }
}
class User{
    private String name;
}
