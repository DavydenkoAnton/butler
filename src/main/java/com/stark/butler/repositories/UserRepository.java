package com.stark.butler.repositories;

import com.stark.butler.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

    @Override
    Optional<User> save(User user);

    @Override
    Optional<User> findById(Long id);


    @Override
    void deleteById(Long id);
}
