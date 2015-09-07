package com.ydsworld.ApacheCommon;

import org.apache.commons.lang.RandomStringUtils;

public class RandomNumner {

	public static void main(String[] args) {
		 // Begin Lottery code
	    System.out.print("The two digit lucky number for the day is >>>");
	    System.out.println(RandomStringUtils.randomNumeric(5));
	    // End Lottery code

	    System.out.print("3) 8 char Alphanumeric string >>>");
	    System.out.println(RandomStringUtils.randomAlphanumeric(8));
	}

}
