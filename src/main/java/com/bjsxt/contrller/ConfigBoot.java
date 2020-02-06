package com.bjsxt.contrller;

import com.bjsxt.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigBoot {
    @Bean("jqk")
    protected User jqk(){
        User user=new User("张三","1234");
        System.out.println(user);
        return user;
    }
}
