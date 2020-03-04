package com.dandy.service;

import com.dandy.model.User;

public interface UserService {
    User getUser(String username, String password);

    User checkUser(String username);

    int addUser(User user);

    int editUser(User user);
}
