package com.learn_spring.exception;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.resource.NoResourceFoundException;

import com.learn_spring.utility.ResponseStatus;


@RestControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(UserNotFoundException.class)
	public ResponseStatus handleUserNotFoundException(UserNotFoundException ex)
	{
		return new ResponseStatus(200,ex.getMessage());
	}
	
	@ExceptionHandler(NoResourceFoundException.class)
	public String handleNoResourceFoundException(NoResourceFoundException ex)
	{
		return "Oops Something Went Wrong...";
	}
}
