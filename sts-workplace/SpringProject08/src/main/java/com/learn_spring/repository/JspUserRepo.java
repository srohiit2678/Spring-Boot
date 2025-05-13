package com.learn_spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.ControllerAdvice;

import com.learn_spring.entity.JspUser;

@ControllerAdvice
public interface JspUserRepo extends JpaRepository<JspUser,String>{

	JspUser getJspUserByUserName(String userName);
}
