package com.ydsworld.Generic;

public class GenericPair<T> {
	
	private T first;
	private T second;
	
	public GenericPair(T one, T two){
		this.first = one;
		this.second = two;
	}

	public T getFirstElement(){
		return first;
	}
	
	public T getSecondElemet(){
		return second;
	}
	
	public void setFirstElement(T obj){
		this.first = obj;
	}
	
	public void setSecondElemet(T obj){
		this.second = obj;
	}
}
