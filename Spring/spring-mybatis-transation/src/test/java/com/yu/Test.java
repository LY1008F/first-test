package com.yu;

import com.yu.entity.User;
import com.yu.mapper.UserMapper;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Test {
    public static void main(String[] args) {
//    IOException    SqlSessionFactory sqlSession = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("mybatis.xml"));
//        SqlSession session = sqlSession.openSession();
//        UserMapper mapper = session.getMapper(UserMapper.class);
//        List<User> allUser = mapper.getAllUser();
//        for(User user:allUser){
//            System.out.println(user);
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapper usermapper =(UserMapper) context.getBean("usermapper2");
        List<User> user = usermapper.getAllUser();
       for (User user1:user){
       System.out.println(user1);
}
    }
}
