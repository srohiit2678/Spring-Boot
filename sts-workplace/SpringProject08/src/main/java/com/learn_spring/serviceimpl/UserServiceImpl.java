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
		User newUser = userRepo.findById(user.getId()).orElse(null);
		//System.out.println(newUser);
		if(newUser == null)
		{
			return userRepo.save(user);
		}
		throw new UserNotFoundException("newUser is Registered already...");
	}

	@Override
	public List<User> getAllUsers() {
		return userRepo.findAll();
	}

	@Override
	public User updateUser(String id, User user) {
			User updateUser = userRepo.findById(id).orElse(null); // id which come from path has to use...?
			if(updateUser != null)
			{
				updateUser.setName(user.getName());
				updateUser.setUserName(user.getUserName());
				updateUser.setPassword(user.getPassword());
				userRepo.save(updateUser);
				return updateUser;
			}
			throw new UserNotFoundException("Invalid User Id..."+id);
	}

	@Override
	public List<User> getUserByName(String name)
	{
		return userRepo.getUserByName(name);
	}
	
	@Override
	public User deleteUser(String id) {
		User user = userRepo.findById(id).orElse(null);
		if(user != null)
		{
			userRepo.delete(user);
			return user;
		}
		throw new UserNotFoundException("Invalid User Id...");
	}

	@Override
	public User loginUser(String UserName, String password) {
	
		return null;
	}	
}
