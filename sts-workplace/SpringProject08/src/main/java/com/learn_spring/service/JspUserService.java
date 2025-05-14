package com.learn_spring.service;

import com.learn_spring.entity.JspUser;


public interface JspUserService {


	JspUser createUser(JspUser user);
	JspUser loginUser(String userName, String password);
	
}
