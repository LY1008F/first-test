package com.yu.mapper;

public class UserMysqlImpl implements UserMapper{
    @Override
    public void getUser() {
        System.out.println("到mysql中操作数据");
    }
}
