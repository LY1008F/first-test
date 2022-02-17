package com.yu.mapper;

import com.yu.entity.User;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

public class UserMapperImp2 extends SqlSessionDaoSupport implements UserMapper{
    //UserMapper mapper = getSqlSession().getMapper(UserMapper.class);
    @Override
    public int addUser(User user) {
        UserMapper mapper = getSqlSession().getMapper(UserMapper.class);
        return mapper.addUser(user);
    }

    @Override
    public int deleteUser(int id) {
        UserMapper mapper = getSqlSession().getMapper(UserMapper.class);
        return mapper.deleteUser(id);
    }

    @Override
    public List<User> getAllUser() {
        User user=new User(6,"op4","098123");
        UserMapper mapper = getSqlSession().getMapper(UserMapper.class);
        mapper.addUser(user);
        mapper.deleteUser(3);
        return mapper.getAllUser();

    }
}
