package com.ydsworld.RegExp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMatches {

	public static void main(String[] args) {
		//String to be Scanned to find the pattern
		String line = "This order was place for QT3000! OK?";
		String pattern = "(.*)(\\d+)(.*)";
		
		//clear a pattern object
		Pattern r = Pattern.compile(pattern);
		
		//now create matcher object
		Matcher m = r.matcher(line);
		if (m.find()){
			System.out.println("Found value: " + m.group(0));
			System.out.println("Found value: " + m.group(1));
			System.out.println("Found value: " + m.group(2));
		} else {
			System.out.println("NO MATCH");
		}
	}
}
