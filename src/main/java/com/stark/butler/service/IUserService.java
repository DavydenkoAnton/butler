package com.stark.butler.service;

import com.stark.butler.model.bean.User;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

;

@Repository
public interface IUserService {

    @Modifying
    @Query(value = "INSERT INTO butler.users(name) " +
            "VALUES (:name)", nativeQuery = true)
    void saveUserByName(@Param("name") String name);


    List<User> findAll();

}