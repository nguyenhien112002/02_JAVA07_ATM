package com.myclass.dao;

import com.myclass.entity.User;

public interface UserDao {
    void update(User user);
    User findById(int id);
}
