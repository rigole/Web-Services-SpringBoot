package com.mobile.demo.service;

import com.mobile.demo.UserRepo;
import com.mobile.demo.entity.UserEntity;
import com.mobile.demo.shared.dto.UserDto;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

public class UserService implements UserServiceImpl {

    @Autowired
    UserRepo userRepo;

    @Override
    public UserDto createUser(UserDto user){
        UserEntity userEntity = new UserEntity();
        BeanUtils.copyProperties(user, userEntity);

        userRepo.save(userEntity);

        UserEntity storedUserDetails = userRepo.save(userEntity);

        userEntity.setEncryptedPassword("test");
        userEntity.setUserId("test");

        UserDto returnValue = new UserDto();

        BeanUtils.copyProperties(storedUserDetails, returnValue);


       return returnValue;
    }
}
