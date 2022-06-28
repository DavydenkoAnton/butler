package com.stark.butler.service;

import com.stark.butler.model.bean.User;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserService implements IUserService {

    @Autowired
    UserService userService;

    @Override
    public List<User> findAll() {
        return userService.findAll();
    }

    @Override
    public void saveUserByName(String name) {
        userService.saveUserByName(name);
    }
}
