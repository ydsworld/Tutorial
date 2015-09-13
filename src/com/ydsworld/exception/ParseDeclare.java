package com.ydsworld.Exception;

import java.text.NumberFormat;
import java.text.ParseException;

public class ParseDeclare {
	
	public float parseIt(String s) throws ParseException {
		NumberFormat format = NumberFormat.getCurrencyInstance();
		Number num = format.parse(s);
		return num.floatValue();
	}

	public static void main(String[] args) {
		ParseDeclare parser = new ParseDeclare();
		String s;
		s = "$45.67";
		
		try {
			System.out.println(parser.parseIt(s));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e){
			e.printStackTrace();
		}

	}

}
