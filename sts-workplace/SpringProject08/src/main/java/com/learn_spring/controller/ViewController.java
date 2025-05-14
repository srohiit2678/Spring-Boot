package com.learn_spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.learn_spring.entity.JspUser;
import com.learn_spring.service.JspUserService;

@Controller
@RequestMapping("/myapplication")
public class ViewController {

	@Autowired
	private JspUserService jspUserService;
	
	
		
	@PostMapping("/login")
	public String loginPage(@RequestParam String userName, @RequestParam String password,Model model)
	{
		JspUser jspUser = jspUserService.loginUser(userName, password);
		model.addAttribute("jspUser",jspUser);
		
		return "home";
	}
	
    @PostMapping("/register")
    public String registerUser(@RequestParam String id,@RequestParam String name,@RequestParam String userName,
    							@RequestParam String password) {

    	System.out.println(id+name+userName+password);
        JspUser user = new JspUser();
        user.setId(id);
        user.setName(name);
        user.setUserName(userName);
        user.setPassword(password);

        jspUserService.createUser(user);

        return "login"; // redirects to success.jsp
    }
    
    //	
//	@GetMapping("/register")
//	public String registerPage()
//	{
//		return "login";
//	}
	
    @GetMapping("/")
	public String homePage()
	{
		return "index";
	}
	


}
