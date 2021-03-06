package com.app.users.bundleusersmicroservices.controller;

import com.app.users.bundleusersmicroservices.models.User;
import com.app.users.bundleusersmicroservices.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {
    @Autowired
    private IUserService userService;

    @GetMapping("/test")
    public String getstatus(){
        return "System up!!!";
    }

    @GetMapping("/users")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @PostMapping("/users")
    public User createUser(@Valid @RequestBody User user) {
        userService.saveUser(user);
        return user;
    }
}
