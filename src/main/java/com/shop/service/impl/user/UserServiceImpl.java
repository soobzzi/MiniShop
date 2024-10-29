package com.shop.service.impl.user;

import com.shop.entity.user.User;
import com.shop.repository.UserRepository;
import com.shop.service.user.UserService;

import java.util.Optional;

public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @Override
    public void addUser(User user) {
        userRepository.save(user);
    }

    @Override
    public Optional<User> getUser(String userId) {
        return userRepository.findById(userId);
    }

    @Override
    public void updateUser(User user) {
        userRepository.save(user);

    }

    @Override
    public boolean checkDuplication(String userId) {
        return userRepository.existsById(userId);
    }
}
