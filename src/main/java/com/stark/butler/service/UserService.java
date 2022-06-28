package com.stark.butler.service;


import com.stark.butler.entity.User;
import com.stark.butler.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public void saveUser(User user) {
        userRepository.save(user);
    }

    public void deleteUserById(Long id){
        userRepository.deleteById(id);
    }

    public Optional<User> findUserById(Long id){
        return userRepository.findById(id);
    }
}
