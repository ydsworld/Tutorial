package com.ydsworld.generic;

public class GenericPairTester {

	public static void main(String[] args) {
		
		GenericPair<Point> points = new GenericPair<Point>(new Point(10, 20), new Point(30, 40));
		Point one = points.getFirstElement();
		System.out.println(one.getX());
		System.out.println(one.getY());
		
		Point two = points.getSecondElemet();
		System.out.println(two.getX());
		System.out.println(two.getY());
		
		GenericPair<String> str = new GenericPair<String>("One", "two");
		String str1 = str.getSecondElemet();
		System.out.println(str1);
		
	} //main
}//class
