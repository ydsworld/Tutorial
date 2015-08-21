package com.ydsworld.exception;

public class BadAgeException extends Exception {
	
	private int age;
	
	
	public BadAgeException(int age) {
		super();
		this.age = age;
	}

	@Override
	public String getMessage(){
		return "You Provided an Invalid Age" + this.age;
	}

}
