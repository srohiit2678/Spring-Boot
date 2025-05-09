package com.learn_spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.learn_spring.entity.User;
import com.learn_spring.service.UserService;

import java.util.List;


@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userService;
	
	@PostMapping("/register")
	public ResponseEntity<User> createUser(@RequestBody User user)
	{
		userService.createUser(user);
		return new ResponseEntity<User>(user,HttpStatus.OK);
	}
	
	@GetMapping("/all")
	public List<User> getAllUsers()
	{
		return userService.getAllUsers();
	}
	
	@PostMapping("/update/{id}")
	public User updateUser(@PathVariable String id, @RequestBody User user)
	{
		return userService.updateUser(id,user);
	}
	
	@DeleteMapping("/delete/{id}")
	public User deleteUser(@PathVariable String id)
	{
		return userService.deleteUser(id);
	}
	
	
}
