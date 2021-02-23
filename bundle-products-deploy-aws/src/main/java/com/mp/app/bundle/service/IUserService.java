package com.mp.app.bundle.service;



import com.mp.app.bundle.models.User;

import java.util.List;
import java.util.Map;

public interface IUserService {
    List<User> getAllUsers();
    User getUserById(Long userId);
    User saveUser(User user);
    User updateUser(Long userId, User user);
    Map<String, Boolean> deleteUser(Long userId);

}
