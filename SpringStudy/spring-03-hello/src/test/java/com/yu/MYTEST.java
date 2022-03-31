package com.yu;

import com.yu.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MYTEST {
    @Test
    public void show(){
        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        User user = (User) context.getBean("hello1");
        System.out.println(user.getName());
    }
}
