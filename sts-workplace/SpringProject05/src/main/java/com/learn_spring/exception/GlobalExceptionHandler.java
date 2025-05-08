package com.learn_spring.exception;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.learn_spring.utility.ResponseStatus;


@RestControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(UserNotFoundException.class)
	public ResponseStatus handleUserNotFoundException(UserNotFoundException ex)
	{
		return new ResponseStatus(200,ex.getMessage());
	}
}
