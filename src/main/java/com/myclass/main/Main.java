package com.myclass.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.myclass.config.AppConfig;
import com.myclass.controller.UserController;
import com.myclass.controller.UserControllerImpl;
import com.myclass.entity.User;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        
        UserController userController = (UserControllerImpl)context.getBean("userController"); 
        
        //In thong tin nguoi chuyen va nguoi nhan truoc khi chuyen tien
        System.out.println("======THÔNG TIN TRƯỚC KHI CHUYỂN======");
        System.out.println("======THÔNG TIN NGƯỜI CHUYỂN======");
        User user = userController.getById(1);
        System.out.println("Họ Tên: " + user.getName());
        System.out.println("Số dư: " + user.getBalance());
        
        System.out.println("======THÔNG TIN NGƯỜI NHẬN======");
        user = userController.getById(2);
        System.out.println("Họ Tên: " + user.getName());
        System.out.println("Số dư: " + user.getBalance());
        //Goi ham thuc hien chuyen tien
        userController.transferMoney(1, 2, 5000);
        
        //in thong tin nguoi chuyen va nguoi nhan sau khi chuyen tien
        System.out.println("======THÔNG TIN SAU KHI CHUYỂN======");
        System.out.println("======THÔNG TIN NGƯỜI CHUYỂN======");
        user = userController.getById(1);
        System.out.println("Họ Tên: " + user.getName());
        System.out.println("Số dư: " + user.getBalance());
        
        System.out.println("======THÔNG TIN NGƯỜI NHẬN======");
        user = userController.getById(2);
        System.out.println("Họ Tên: " + user.getName());
        System.out.println("Số dư: " + user.getBalance());
    }

}
