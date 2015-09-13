package com.ydsworld.generic;

public class GenericMethodTest {
	
	//generic method printArray
	public static <E> void printArray(E[] inputArray){
		//display array elements
		for(E element : inputArray){
			System.out.printf("%s ", element);
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		//create Array
		Integer[] intArray = {1,2,3,4,5};
		Double[] doubleArray = {1.1,5.2,4.4};
		Character[] charArray = {'A','N','U'};
		
		System.out.println("Integer Array Contains: ");
		printArray(intArray);
		
		System.out.println("\nDouble Array Contains:");
		printArray(doubleArray);
		
		System.out.println("\nString Array Contains :");
		printArray(charArray);
		

	}

}