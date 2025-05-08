package com.carcass.practice.handler;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
//@ControllerAdvice   //this will not work
public class GlobalExceptionHandler {
	
	@ExceptionHandler(UserNotFound.class)
	public String handleUserNotFoundException(UserNotFound u)
	{
		return "Please Provide Correct User ID";
	}
	
	@ExceptionHandler(Exception.class)
	public String demo(Exception e)
	{
		return "Something Went Wrong";
	}
	
//	@ExceptionHandler(NoResourceFoundException.class)
//	public String demo(NoResourceFoundException e)
//	{
//		return "Something Went Wrong";
//	}
}
