package com.freedom.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.freedom.entity.User;
import com.freedom.mapper.UserMapper;
import com.freedom.service.UserService;

@Service(value="userService")
public class UserServiceImpl implements UserService {
	@Autowired
    private UserMapper userMapper;
	
	@Override
	public User selectByPrimaryKey(Integer userId) {
		return userMapper.selectByPrimaryKey(userId);
	}

	@Override
	public List<User> selectAllUsers() {
		
		return userMapper.selectAllUsers();
	}

}
