package com.ydsworld.Exception;

public class UsePerson {
	public static void main(String[] args) {
		Person p = null;
		String name = "Anurag";
		int age = -50;
		
		try {
			p = new Person(name,age);
			
			if (p instanceof Person){
				System.out.println("true");
			}
			System.out.println(p);
		} catch (InvalidDataException | BadAgeException e) {
			System.err.println(e.getMessage());
		}
		
	}	
	
}
