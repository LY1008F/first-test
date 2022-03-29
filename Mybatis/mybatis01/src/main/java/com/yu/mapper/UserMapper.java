package com.yu.mapper;

import com.yu.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    //查询全部用户
    List<User> getUserList();
   //模糊查询
    List<User> getUserLike( String vaule);
    //根据id查看指定用户
    User getUserById(int id);
    //根据id删除用户
    int deleteById(int id);
    //增加用户
    int addUser(User user);
    int addUser2(Map<String,Object> map);

    //修改用户
    int updateUser(User user);
    //根据用户密码查询用户
    User select0UserByUP(@Param("username") String username,@Param("password") String password);
    User selectUserByUP2(Map<String,Object> map);


}
