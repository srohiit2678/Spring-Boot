package com.learn_spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("project")
public class ViewController {

	@GetMapping("/home")
	public String homePage()
	{
		return "index";
	}
}
