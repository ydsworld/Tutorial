package com.ydsworld.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListSet {

	public static void main(String[] args) {
		CD cd1 = new CD(1, "The Beatles", "The BEatleat");
		CD cd2 = new CD(2, "AR Rehman", "AR titke");
		CD cd3 = new CD(3, "MJ","Danzorous");
         
		//keep the insertion order 
		//List<CD> cdCollection = new ArrayList<>();
		
		List<CD> cdCollection = new LinkedList<>();
		
		cdCollection.add(cd1);
		cdCollection.add(cd2);
		cdCollection.add(cd3);
		
		for (CD element: cdCollection) {
			System.out.println(element);
		}
	}

}
