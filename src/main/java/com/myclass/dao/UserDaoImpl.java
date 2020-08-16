package com.myclass.dao;

import java.util.ArrayList;
import java.util.List;

import com.myclass.entity.User;

public class UserDaoImpl implements UserDao {

    List<User> users = null;

    public UserDaoImpl() {
        users = new ArrayList<User>();
        users.add(new User(1, "nguyen van chuyen", 20000));
        users.add(new User(2, "nguyen van nhan", 5000));

    }

    public void update(User user) {
        // TODO Auto-generated method stub
        User entity = findById(user.getId());
        if (entity!= null) {
            entity.setName(user.getName());
            entity.setBalance(user.getBalance());
        }
    }

    public User findById(int id) {
        // TODO Auto-generated method stub
        for(User user: users) {
            if(user.getId() == id) {
                return user;
            }
        }
        return null;
    }

}
