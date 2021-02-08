package com.app.users.bundleusersmicroservices.service;

import com.app.users.bundleusersmicroservices.models.User;

import java.util.List;
import java.util.Map;

public interface IUserService {
    List<User> getAllUsers();
    User getUserById(Long userId);
    User saveUser(User user);
    User updateUser(Long userId, User user);
    Map<String, Boolean> deleteUser(Long userId);

}
