package com.mobile.demo;

import com.mobile.demo.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends CrudRepository<UserEntity, Long>  {
    UserEntity findUserByEmail(String email);
}
