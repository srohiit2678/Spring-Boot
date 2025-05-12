package com.learn_spring.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learn_spring.entity.User;
import com.learn_spring.repository.UserRepo;
import com.learn_spring.service.UserService;
import com.learn_spring.exception.UserNotFoundException;

@Service
public class UserServiceImpl implements UserService {

	
	
	@Autowired
	private UserRepo userRepo;
	
	@Override
	public User createUser(User user) {
		
		return userRepo.save(user);
	}

	@Override
	public List<User> getAllUsers() {
		
		return userRepo.findAll();
	}

	@Override
	public User deleteUser(String id) {
		Optional<User> user = userRepo.findById(id);
		if(!user.isEmpty()) {
		userRepo.delete(user.get());
		return user.get();
		}
		
		else{
			//System.out.println("working up to");
			throw new UserNotFoundException("Invalid user id...");
		}
		}
	}
