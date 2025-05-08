package com.learn_spring.service;


import com.learn_spring.entity.User;
import java.util.List;

public interface UserService {

	User createUser(User user);
	
	List<User> getAllUsers();
	
	User updateUser(String id,User user);
	
	User deleteUser(String id);

}
