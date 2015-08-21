package com.ydsworld.exception;

public class InvalidDataException extends Exception {
    
	private String name;
	
	public InvalidDataException(String name){
		this.name = name;
	}
		
	@Override
	public String getMessage(){
		return "Name must be provided " + this.name;
	}

	
	
}
