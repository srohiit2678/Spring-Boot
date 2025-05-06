package com.learn_spring.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
	
	@GetMapping("/abc")
	public String getName()
	{
		return "Rohit Ojha";
	}
}
