package com.learn_spring.exception;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.learn_spring.respons.ResponseStatus;

@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(UserNotFoundException.class)
	public ResponseStatus handleUserNotFoundException(UserNotFoundException e)
	{
		return new ResponseStatus(200,e.getMessage());
	}
}
