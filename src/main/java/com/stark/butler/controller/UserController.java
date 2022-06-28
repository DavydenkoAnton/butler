package com.stark.butler.controller;

import com.stark.butler.entity.User;
import com.stark.butler.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    public User getUserById(Long id) {
        User user = new User();
        Optional<User> optionalUser = userService.findUserById(id);
        if (optionalUser.isPresent()) {
            user = optionalUser.get();
        }
        return user;
    }

}