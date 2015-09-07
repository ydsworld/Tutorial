package com.ydsworld.Interface;

public class Person implements Info {

	private String name;
	
	
	public Person(String name) {
		this.name = name;
	}


	public void greet(){
		System.out.println("Hello " + this.name);
	}
	
	@Override
	public void showInfo() {
		System.out.println("Person Nanme " + name);
		
	}

}
