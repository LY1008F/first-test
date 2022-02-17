package com.yu;

import com.yu.entity.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
          User user= (User) context.getBean("opp");
        System.out.println(user.toString());
    }
}
