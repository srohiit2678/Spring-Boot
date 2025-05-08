package com.learn_spring.serviceimpl;

import org.springframework.stereotype.Service;
import java.util.List;
import java.util.ArrayList;
import com.learn_spring.entity.*;
import com.learn_spring.service.*;

@Service
public class UserServiceImpl implements UserService {
	List<User> userList = new ArrayList<>();
	
	@Override
	public User createUser(User user)
	{
		userList.add(user);
		return user;
	}
	@Override
	public List<User> getAlluser() {		
		return userList;
	}
	@Override
	public User updateUser(String id, User user) {
		for(User findUser :userList)
		{
			if(findUser.getId().equals(id))
			{
				findUser.setName(user.getName());
				findUser.getName(user.getUserName());
				findUser.getPassword()user.getPassword());
				return findUser;
			}
		}
		return null;
	}
	@Override
	public User deleteUser(String id) {
		for(User findUser : userList)
		{
			if(findUser.getId().equals(id))
			{
				userList.remove(findUser);
			}
		}
			return null;
	}
	
}
