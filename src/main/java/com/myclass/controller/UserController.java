package com.myclass.controller;

import com.myclass.entity.User;

public interface UserController {
    void transferMoney(int fromId, int toId, long money);
    User getById(int id);
}   
