package com.learn_spring.service;

import java.util.List;

import com.learn_spring.entity.User;

public interface UserService {

	User createUser(User user);
	List<User> getAllUsers();
	User updateUser(String id,User user);
	User deleteUser(String id);
}
