package com.learn_spring.exception;

public class UserNotFoundException extends RuntimeException{

	public UserNotFoundException() {
		super();
	}
	public UserNotFoundException(String message) {
		super(message);
	}
	
	
}
