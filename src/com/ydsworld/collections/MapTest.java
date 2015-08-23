package com.ydsworld.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapTest {
	public static void main(String[] args) {
		CD cd1 = new CD(1, "The Beatles", "The BEatleat");
		CD cd2 = new CD(2, "AR Rehman", "AR titke");
		CD cd3 = new CD(3, "MJ", "Danzorous");

		// NO INSERTION ORDER
		//Map<String, CD> cdCollection = new HashMap<>();
		
		// KEEP INSERTION ORDER
		//Map<String, CD> cdCollection = new LinkedHashMap<>();
		
		// SORT BASE ON KEY ORDER . IMPLEMENT HASCODE AND EQUAAL METHOD IN CLASS
		Map<String, CD> cdCollection = new TreeMap<>();

		cdCollection.put("B00004ZAV3", cd1);
		cdCollection.put("A00005M989", cd2);
		cdCollection.put("Z000UVT30I", cd3);

		Set<String> keySet = cdCollection.keySet();

		Iterator<String> it = keySet.iterator();
		while (it.hasNext()) {
			String key = it.next();
			System.out.print("Key :" + key);
			System.out.println(" Value : " + cdCollection.get(key));
		}
	}
}
