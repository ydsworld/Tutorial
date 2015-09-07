package com.ydsworld.Interface;

public class Machine implements Info{

	private int id=9;
	
	public void start(){
		System.out.println("Machine started");
	}
	
	@Override
	public void showInfo() {
		System.out.println("Machine Id " + id);
		
	}

}
