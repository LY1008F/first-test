package Mytest;

import com.yu.service.UserService;
import com.yu.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MYTest {
    public static void main(String[] args) {
//        UserService userService=new UserServiceImpl();
//        userService.getUser();
        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        context.getBean("");
    }
}
