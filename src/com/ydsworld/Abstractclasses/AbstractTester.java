package com.ydsworld.Abstractclasses;

public class AbstractTester {
	public static void main(String[] args) {
		HalogenLight hl = new HalogenLight();
		
		hl.turnOff();
		System.out.println(hl.getStatus());
		hl.turnOn();
		System.out.println(hl.getStatus());
		hl.changeBulb();
	}
}
