package com.ydsworld.Locales;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class FormatDateLocale {

	public static void main(String[] args) {
		Locale[] locales = new Locale[] {Locale.JAPAN, Locale.CHINA, Locale.KOREA, Locale.TAIWAN, Locale.ITALY, Locale.FRANCE, Locale.GERMAN, Locale.ENGLISH};
	  
		Date today = new Date();
		
		for(Locale locale : locales){
			System.out.println("Display format in " 
					+ locale.getDisplayName()
					+ " = "
					+ SimpleDateFormat.getDateInstance(SimpleDateFormat.LONG,locale).format(today).toUpperCase());
		}
	
	} //main

}//classe
