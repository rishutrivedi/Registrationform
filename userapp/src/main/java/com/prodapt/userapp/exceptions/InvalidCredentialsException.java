package com.prodapt.userapp.exceptions;

import org.springframework.stereotype.Component;

@Component
public class InvalidCredentialsException extends Exception{
	
	private String message;

	public InvalidCredentialsException(String message) {
		super();
		this.message = message;
	}

	public InvalidCredentialsException() {
		super();
	}

	@Override
	public String toString() {
		return "InvalidCredentialsException [message=" + message + "]";
	}
	
}