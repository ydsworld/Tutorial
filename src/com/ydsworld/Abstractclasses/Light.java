package com.ydsworld.Abstractclasses;

public abstract class Light {
	
	private Status status;
	
	
	public Status getStatus() {
		return status;
	}

	//on
	public void turnOn(){
		this.status = Status.ON;
	}
	
	//off
	public void turnOff(){
		this.status = Status.OFF;
	}
	
	
	public abstract void changeBulb();

	@Override
	public String toString() {
		String className = this.getClass().getName();
		return "The " + className + " is turned" +
				this.status.toString().toLowerCase();
	}
}
