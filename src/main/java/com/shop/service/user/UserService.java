package com.shop.service.user;

import com.shop.entity.user.User;

import java.util.Optional;

public interface UserService {

    public void addUser(User user);

    public Optional<User> getUser(String userId);

    public void updateUser(User user);

    public boolean checkDuplication(String userId);
}
