package com.learn_spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learn_spring.entity.User;

public interface UserRepo extends JpaRepository<User,String>{

}
