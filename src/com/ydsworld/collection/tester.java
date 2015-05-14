package com.ydsworld.collection;

import java.util.List;

public class tester {

	public static void main(String[] args) {
		ModernCar mc = new ModernCar();
		List<Car> workCar = null;
		workCar.add(new Car(1,"Toyoya"));
	//	workCar.add(new Car(2,"Honda"));
		
		if (workCar.contains(new Car(1,"Toyota"))){
			System.out.println("yes");
		}
		
	}

}
