package com.ydsworld.generic;

import java.util.Arrays;
import java.util.List;

public class GenericWildcardExample<T> {

	//method
	private static Number sum(List<? extends Number> numbers){
		double s =0.0;
		for(Number n: numbers){
			s += n.doubleValue();
		}
		return s;
	}
	
	
	public static void main(String[] args) {
		
		//list of Integer
		List<Integer> ints = Arrays.asList(1,2,3,4,5);
		System.out.println(sum(ints));
		
		//list of doubles
		List<Double> dobles = Arrays.asList(10.5d,2d,3d);
		System.out.println(sum(dobles));
		
		//List<String> strings = Arrays.asList("1","2");
		//System.out.println(sum(strings));
	}
	

}
