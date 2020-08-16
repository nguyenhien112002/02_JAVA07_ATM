package com.myclass.main;

import com.myclass.controller.UserController;
import com.myclass.controller.UserControllerImpl;
import com.myclass.entity.User;

public class Main {

    public static void main(String[] args) {
        UserController userController = new UserControllerImpl();
        //In thong tin nguoi chuyen va nguoi nhan truoc khi chuyen tien
        System.out.println("======THÔNG TIN TRƯỚC KHI CHUYỂN======");
        User user = userController.getById(1);
        
        //Goi ham thuc hien chuyen tien
        
        
        //in thong tin nguoi chuyen va nguoi nhan sau khi chuyen tien
    }

}
