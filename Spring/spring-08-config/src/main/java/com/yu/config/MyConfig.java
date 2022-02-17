package com.yu.config;

import com.yu.entity.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(MyConfig.class)
public class MyConfig {
    @Bean
    public User user(){
        return new User();
    }
}
