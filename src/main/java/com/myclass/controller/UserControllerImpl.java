package com.myclass.controller;

import com.myclass.dao.UserDao;
import com.myclass.dao.UserDaoImpl;
import com.myclass.entity.User;

public class UserControllerImpl implements UserController{
    private UserDao userDao = null;
    
    public UserControllerImpl(UserDao userDao) {
        this.userDao = userDao;
    }
    public void transferMoney(int fromId, int toId, long money) {
        
        User source = userDao.findById(fromId);
        User target = userDao.findById(toId);
        //tru tien nguoi gui
        source.setBalance(source.getBalance()-money);
        
        //cong tien nguoi nhan
        target.setBalance(target.getBalance()+money);
        
        //update thong tin
        userDao.update(source);
        userDao.update(target);
    }

    public User getById(int id) {
        return userDao.findById(id);
    }

}
