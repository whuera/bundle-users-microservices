package com.app.users.bundleusersmicroservices.service;

import com.app.users.bundleusersmicroservices.models.User;
import com.app.users.bundleusersmicroservices.repository.IUserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import javax.transaction.Transactional;
import java.util.List;
import java.util.Map;

@Transactional
@Service
public class UserService implements IUserService {
    @Autowired
    private IUserRepository userRepository;

    private static final Logger LOGGER = LoggerFactory.getLogger(UserService.class);
    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User getUserById(Long userId) {
        return null;
    }

    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User updateUser(Long userId, User user) {
        return null;
    }

    @Override
    public Map<String, Boolean> deleteUser(Long userId) {
        return null;
    }
}
