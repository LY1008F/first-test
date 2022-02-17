package com.yu;

import com.yu.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {
    public static void main(String[] args) {
        //获取spring上下文对象
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
   //对象都在spring容器中，需要直接拿出来
        User username =(User) context.getBean("user");
        System.out.println(username.toString());
    }
}
