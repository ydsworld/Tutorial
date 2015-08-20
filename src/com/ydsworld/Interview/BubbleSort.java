package com.ydsworld.Interview;


public class BubbleSort {

public static void bubble_sortAsc(int[] numArray){
	int n = numArray.length;
	int temp =0;
	
	for (int i = 0; i <n; i++) {
		for (int j = 1; j < (n-i); j++) {
			if(numArray[j-1]>numArray[j]){
				temp = numArray[j-1];
				numArray[j-1] = numArray[j];
				numArray[j]= temp;
			}
		}
		
	}
}

public static void bubble_sortDesc(int[] numArray){
	
	int n = numArray.length;
	int temp = 0;
	
	for (int i = 0; i < n; i++) {
		for (int j = 1; j < (n-i); j++) {
			if(numArray[j-1] < numArray[j]){
				temp = numArray[j-1];
				numArray[j-1] = numArray[j];
				numArray[j] = temp;
			}
		}
	}
	
	
}

public static void main(String[] args) {
	int[] input = {34,5,6,43,6,1010,5,1,10};
	bubble_sortAsc(input);
	for (int i = 0; i < input.length; i++) {
		
		System.out.println(input[i]);
	}
	
	System.out.println("Decending Order");
	
	bubble_sortDesc(input);
	for (int i = 0; i < input.length; i++) {
		
		System.out.println(input[i]);
	}

}
	
	
	
	
} 
