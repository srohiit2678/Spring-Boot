package com.learn_spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.learn_spring.service_impl.*;
import com.learn_spring.entity.*;

@RestController
public class UserController {
	@Autowired
	ServiceImpl impl;
	
	@RequestMapping("/newUser")
	public String User(@RequestBody User user)
	{
		user = impl.createUser(user);
		return user.toString();
	}	
}
