package com.ydsworld.generic;

import java.util.ArrayList;
import java.util.List;

public class ListOfList {

	public static void main(String[] args) {
		List<String> listOfStrings = new ArrayList<String>();
		listOfStrings.add("Hello again");
		listOfStrings.add("Hello one more");
		
		List<List<String>> listOfLists = new ArrayList<List<String>>();
		listOfLists.add(listOfStrings);
		
		String s = listOfLists.get(0).get(1)		;
		System.out.println(s);

	}

}
