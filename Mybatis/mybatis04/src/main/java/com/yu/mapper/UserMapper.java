package com.yu.mapper;

import com.yu.pojo.User;

import java.util.List;

public interface UserMapper {
    /*查询所有user*/
    List<User> selectAll();
}
