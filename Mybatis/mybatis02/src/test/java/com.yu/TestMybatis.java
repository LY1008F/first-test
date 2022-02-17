package com.yu;

import com.yu.mapper.UserMapper;
import com.yu.pojo.User;
import com.yu.utils.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class
TestMybatis {
    @Test
    public void selectUser() {
        SqlSession sqlSession = MybatisUtil.getSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user= userMapper.selectUserById(1);
        System.out.println(user);


        sqlSession.close();

    }
    @Test
    public void selectAllUse(){
        SqlSession sqlSession = MybatisUtil.getSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        Map<String,Integer> map=new HashMap<String,Integer>();
        map.put("startIndex",1*2);
        map.put("pageSize",2);
        List<User> userList=userMapper.selectAllUser(map);
        userMapper.selectAllUser(map);


        for(User user:userList){
            System.out.println(user);
        }
sqlSession.close();



    }
}