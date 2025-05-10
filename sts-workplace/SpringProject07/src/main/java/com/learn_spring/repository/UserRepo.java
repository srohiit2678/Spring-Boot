package com.learn_spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.learn_spring.entity.*;

@Repository
public interface UserRepo extends JpaRepository<User,String>{

}
