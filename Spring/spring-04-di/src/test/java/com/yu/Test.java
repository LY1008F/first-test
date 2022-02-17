package com.yu;

import com.yu.entity.Student;
import com.yu.entity.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
       ApplicationContext context =new ClassPathXmlApplicationContext("beans.xml");
        User user =(User) context.getBean("user");
        User user1 =(User) context.getBean("user");

        System.out.println(user==user1);
    }

}
