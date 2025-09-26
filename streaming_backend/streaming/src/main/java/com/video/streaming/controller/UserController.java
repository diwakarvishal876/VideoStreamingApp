package com.video.streaming.controller;

import com.video.streaming.entity.User;
import com.video.streaming.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping
    List<User> getAllUser(){

        List<User> users=new ArrayList<>();
        return users;
    }

    @PostMapping
    User addNewUser(@RequestBody User user){
        return userService.addNewUser(user);
    }

    @PutMapping

}
