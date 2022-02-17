package com.yu.mapper;

import com.yu.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface UserMapper {
    //查询全部用户
    User selectUserById(int id);
    List<User> selectAllUser(Map<String,Integer> map);



}
