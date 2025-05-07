package com.learn_spring.service_impl;

import org.springframework.stereotype.Service;
import java.util.List;
import java.util.ArrayList;
import com.learn_spring.entity.*;
import com.learn_spring.service.*;

@Service
public class ServiceImpl implements UserService {
	List<User> li = new ArrayList<>();
	@Override
	public User createUser(User user)
	{
		li.add(user);
		return user;
	}
	
}
