package com.mobile.demo.contoller;

import com.mobile.demo.model.UserDetailsRequestModel;
import com.mobile.demo.model.response.UserRest;
import com.mobile.demo.service.UserService;
import com.mobile.demo.shared.dto.UserDto;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("users")
public class UserController {

    
    UserService userService;

    @GetMapping
    public String getUser(){

        return "get user was called";
    }

    @PostMapping
    public UserRest createUser(@RequestBody UserDetailsRequestModel userDetails){

        UserRest returnValue = new UserRest();

        UserDto userDto = new UserDto();
        UserDto createdUser = userService.createUser(userDto);
        BeanUtils.copyProperties(createdUser, returnValue);
        BeanUtils.copyProperties(userDetails, userDto);

        return returnValue;
    }

    @PutMapping
    public String updateUser(){

        return "updated user was called";
    }

    @DeleteMapping
    public String deleteUser(){

        return "delete user was called";
    }

}
