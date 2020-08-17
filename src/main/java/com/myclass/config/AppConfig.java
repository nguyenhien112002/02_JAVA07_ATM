package com.myclass.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.myclass.controller.UserController;
import com.myclass.controller.UserControllerImpl;
import com.myclass.dao.UserDao;
import com.myclass.dao.UserDaoImpl;

@Configuration
public class AppConfig {
    @Bean
    public UserDao userDao() {
        return new UserDaoImpl();
    }
    @Bean
    public UserController userController() {
        return new UserControllerImpl(userDao());
    }
    
}
