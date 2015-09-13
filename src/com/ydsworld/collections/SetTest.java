package com.ydsworld.collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetTest {

	public static void main(String[] args) {
		CD cd1 = new CD(1, "The Beatles", "The BEatleat");
		CD cd2 = new CD(2, "AR Rehman", "AR titke");
		CD cd3 = new CD(3, "MJ","Danzorous");
		
		 //DOES NOT KEEP THE ORDER
		//Set<CD> cdCollection = new HashSet<>(); -
		
		
		// KEEP THE ORDER
		Set<CD> cdCollection = new LinkedHashSet<>();
		
		cdCollection.add(cd1);
		cdCollection.add(cd2);
		cdCollection.add(cd3);
		
		printColl(cdCollection);
		
	}
	
	public static void printColl(Set<CD> set){
		Iterator<CD> it = set.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
	}

}
