package com.yu;

import com.yu.entity.User;
import com.yu.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.util.List;


public class Test {
    public static void main(String[] args)  {

//        SqlSessionFactory sqlSessionFactory =
//                new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("mybatis-config.xml"));
//        SqlSession session = sqlSessionFactory.openSession();
//        UserMapper mapper = session.getMapper(UserMapper.class);
//       List<User> list= mapper.selectUser();
//       for (User user:list){
//           System.out.println(user);
//       }
//        session.close();
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        UserMapper usermapper =(UserMapper) context.getBean("usermapper");
        List<User> list = usermapper.selectUser();
        for(User user:list){
            System.out.println(user);
        }
    }

    }
