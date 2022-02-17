package com.yu.mapper;

import com.yu.entity.User;

import java.util.List;

public interface UserMapper {
    List<User> getAllUser();
    int addUser(User user);
    int deleteUser(int id);
}
