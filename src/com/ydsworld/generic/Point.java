package com.ydsworld.generic;

public class Point {
	int x;
	int y;
	
	
	public Point(int x, int y) {
		this.x =x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	
	@Override
	public String toString(){
		//System.out.println("x : "+ this.x + " y :" + this.y);
		return "x : "+ this.x + " y :" + this.y;
	}
}
