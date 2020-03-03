package com.dandy.dao;

import com.dandy.model.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDao {

    User getUser(String username, String password);

    User checkUser(String username);

    int addUser(User user);
}
