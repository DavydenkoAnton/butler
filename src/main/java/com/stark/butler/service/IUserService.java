package com.stark.butler.service;

;
import com.stark.butler.model.bean.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IUserService {

    List<User> findAll();

}