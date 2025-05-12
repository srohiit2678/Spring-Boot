package com.learn_spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.learn_spring.entity.User;
import com.learn_spring.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	UserService userService;
	
	
	@PostMapping("/register")
	public User createUser(@RequestBody User user)
	{
		return userService.createUser(user);
	}
	
	@GetMapping("/all")
	List<User> getAllUsers()
	{
		return userService.getAllUsers();
	}
	
	@DeleteMapping("/delete/{id}")
	public User deleteUser(@PathVariable String id)
	{
		return userService.deleteUser(id);
	}
	
}
