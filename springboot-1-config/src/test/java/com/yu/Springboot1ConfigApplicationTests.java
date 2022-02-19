package com.yu;

import com.yu.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Springboot1ConfigApplicationTests {
    @Autowired
    User user;
    @Test
    void contextLoads() {
        System.out.println(user);
    }

}
