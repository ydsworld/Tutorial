package com.ydsworld.generic;

public class PointCompareTester {

	public static void main(String[] args) {
		Point p1 = new Point(10, 20);
		Point p2 = new Point(10, 20);
		
		if (p1.compareTo(p2) < 0){
			System.out.println(p1 + " is Less than " + p2);
		} else if (p1.compareTo(p2)>0) {
			System.out.println(p1 + " is Greater than " + p2);
		} else {
			System.out.println(p1 + " is Equal than " + p2);
		}
	}

}
