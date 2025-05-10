
package com.learn_spring.serviceimpl;

import com.learn_spring.entity.User;
import com.learn_spring.exception.UserNotFoundException;
import com.learn_spring.repository.UserRepo;
import com.learn_spring.service.UserService;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UserServiceImpl implements UserService{
	
	List<User> userList = new ArrayList<>();

	@Autowired
	private UserRepo userRepo;

	@Override
	public User createUser(User user)
	{
		return userRepo.save(user);
	}

	@Override
	public List<User> getAllUsers() {
		return userRepo.findAll();
	}

	@Override
	public User updateUser(String id, User user) {
		for(User findUser : userList)
		{
			if(findUser.getId().equals(id))
			{
				findUser.setName(user.getName());
				findUser.setUserName(user.getUserName());
				return findUser;
			}
		}
		throw new UserNotFoundException("Invalid User Id...");
	}

	@Override
	public User deleteUser(String id) {
		User user = userRepo.findById(id).get();
		if(user != null)
		{
			userRepo.delete(user);
			return user;
		}
		throw new UserNotFoundException("Invalid User Id...");
	}	
}
