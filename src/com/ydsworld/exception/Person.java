package com.ydsworld.exception;

public class Person {
	private String name;
	private int age;
	
	public Person(String n, int age) throws InvalidDataException, BadAgeException{
		
		if(n==null || n.equals("")){
			throw new InvalidDataException(n);
		}
		
		if (age <0 || age > 120){
			throw new BadAgeException(age);
		}
		
		this.name = n;
		this.age = age;
	}
	
	public String toString(){
		return "Person [name=" + name + "] , [age=" + this.age + "]";
	}
}
