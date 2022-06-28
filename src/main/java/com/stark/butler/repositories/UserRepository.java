package com.stark.butler.repositories;

import com.stark.butler.model.bean.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Long> {

}
