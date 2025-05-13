package com.learn_spring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.learn_spring.entity.User;

@RestControllerAdvice
public interface UserRepo extends JpaRepository<User ,String> {

	List<User> getUserByName(String name);
	User getUserByIdAndName(String id,String name);
}
