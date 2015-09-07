package com.ydsworld.Interface;

public class App {
	public static void main(String[] args) {
		Machine m1 = new Machine();
		Person p1 = new Person("Bob");

		m1.start();
		p1.greet();

		Info info1 = new Machine();
		info1.showInfo();

		Info info2 = new Person("Anurag");
		info2.showInfo();
		
		System.out.println();
		
		dispInfo(m1);
		dispInfo(p1);
	}
	
	public static void dispInfo(Info info){
		info.showInfo();
	}
}
