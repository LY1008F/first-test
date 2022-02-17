package com.yu.service;

public class UserServiceImpl  implements UserService{
    @Override
    public void add() {
        System.out.println("添加");
    }

    @Override
    public void delete() {
        System.out.println("删除" );
    }
}
