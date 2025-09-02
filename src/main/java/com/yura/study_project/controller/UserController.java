package com.yura.study_project.controller;

import com.yura.study_project.dto.UserDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/user")
    public UserDto getUser() {
        UserDto user = new UserDto();
        user.setName("test");
        user.setAge(22);
        return user;
    }
}
