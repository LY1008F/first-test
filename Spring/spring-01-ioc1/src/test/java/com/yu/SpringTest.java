package com.yu;

import com.yu.mapper.UserMapperImpl;
import com.yu.mapper.UserMysqlImpl;
import com.yu.service.UserService;
import com.yu.service.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {

@Test
    public void test(){
//用户实际调用的Service层，dao层不要接触
//    UserService userService=new UserServiceImpl();
//    ( (UserServiceImpl)userService).setUserMapper(new UserMapperImpl());
//             userService.getUser();

    ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
    UserServiceImpl userServiceImp =(UserServiceImpl) context.getBean("userServiceImp");
    userServiceImp.getUser();

}

}
