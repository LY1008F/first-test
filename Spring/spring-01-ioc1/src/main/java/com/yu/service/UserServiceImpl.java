package com.yu.service;

import com.yu.mapper.UserMapper;
public class UserServiceImpl implements UserService{
    private UserMapper userMapper;


    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public void getUser() {
    userMapper.getUser();
    }
}
