package com.ydsworld.generic;

import java.util.ArrayList;
import java.util.List;

class Fruit{
	@Override
	public String toString(){
		return "I m Fruit!";
	}
}

class Apple extends Fruit{
	@Override
	public String toString(){
		return "I m Apple!";
	}
}


public class GenericFruit {

	public static void main(String[] args) {
		//list of apples
		List<Apple> apples = new ArrayList<Apple>();
		apples.add(new Apple());
		
		//we can assign a list of apples to baske of fruites
		//becase apple is subtype of fruit
		List<? extends Fruit> basket = apples;
		
		for(Fruit fruit : basket){
			System.out.println(fruit);
		}
	}
}
