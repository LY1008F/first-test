package com.yu.service;

import com.yu.pojo.UserMapper;
import com.yu.pojo.UserMapperImpl;

public class UserServiceImpl implements UserService{
    private UserMapper userMapper=new UserMapperImpl();
    @Override
    public void getUser() {
        userMapper.getUser();
    }
}
