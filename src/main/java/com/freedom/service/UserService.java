package com.freedom.service;

import java.util.List;

import com.freedom.entity.User;

public interface UserService {

    User selectByPrimaryKey(Integer userId);
    
    List<User> selectAllUsers();
}
