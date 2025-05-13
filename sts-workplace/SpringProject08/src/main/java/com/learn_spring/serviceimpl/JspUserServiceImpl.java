package com.learn_spring.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learn_spring.entity.JspUser;
import com.learn_spring.exception.UserNotFoundException;
import com.learn_spring.repository.JspUserRepo;
import com.learn_spring.service.JspUserService;

@Service
public class JspUserServiceImpl implements JspUserService {

	@Autowired
	JspUserRepo jspUserRepo;
	
	@Override
	public JspUser createUser(JspUser user) {
	JspUser newUser = 	jspUserRepo.findById(user.getId()).orElse(null);
		if(newUser == null)
		{
			return jspUserRepo.save(user);
		}
		throw new UserNotFoundException("newUser is Registered already...");
	}

	@Override
	public JspUser loginUser(String userName, String password) {
		JspUser user = jspUserRepo.getJspUserByUserName(userName);
		if(user.getPassword().equals(password))
		{
			return user;
		}
		throw new UserNotFoundException("invalid user & password");
	}

	
	
}
