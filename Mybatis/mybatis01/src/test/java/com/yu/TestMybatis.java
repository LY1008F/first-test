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
    public void selectAllUser(){
        SqlSession sqlSession= MybatisUtil.getSession();
       UserMapper userMapper=  sqlSession.getMapper(UserMapper.class);
      List<User> userList =userMapper.getUserList();
      for(User user:userList){
          System.out.println(user);
      }

      sqlSession.close();

    }
    @Test
    public void getUserById(){
       SqlSession session= MybatisUtil.getSession();
        UserMapper userMapper= session.getMapper(UserMapper.class);
              User user=  userMapper.getUserById(3);
        System.out.println(user);

     session.close();
    }
    @Test
    public void test3(){
        SqlSession sqlSession= MybatisUtil.getSession();
       UserMapper userMapper= sqlSession.getMapper(UserMapper.class);
//     //输出用户
//        userMapper.deleteById(2);
//        System.out.println("删除成功");
        //增加用户
//        userMapper.addUser(new User(4,"op1","987321"));
//根据id返回对象，修改用户
//         User user= userMapper.getUserById(1);
//          user.setUname("op2");
//          userMapper.updateUser(user);

//    User user=    userMapper.selectUserByUP("op1","987321");
//        System.out.println(user);
        Map<String,Object> map=new HashMap<String, Object>();
        map.put("uname","op1");
        map.put("pwd","987321");
        User user= userMapper.selectUserByUP2(map);
        System.out.println(user);
        sqlSession.commit();//提交到事务，不写的话不会提交到数据库中
        sqlSession.close();
    }

@Test
public void addUser2(){
    SqlSession session =MybatisUtil.getSession();
    UserMapper userMapper= session.getMapper(UserMapper.class);
    Map<String,Object> map=new HashMap<String, Object>();
    map.put("id",2);
    map.put("uname","op3");
    map.put("pwd","123654");
    userMapper.addUser2(map);

    session.commit();
    session.close();
}


@Test
public void getUserLike(){
    SqlSession sqlSession= MybatisUtil.getSession();
    UserMapper userMapper=  sqlSession.getMapper(UserMapper.class);
//     List<User> list= userMapper.getUserLike("%op%");

    List<User> list= userMapper.getUserLike("op");
       for (User user:list){
           System.out.println(user);
       }
      sqlSession.close();

}

}