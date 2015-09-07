package com.ydsworld.Locales;

import java.util.Locale;

public class AvailableLocal {

	public static void main(String[] args) {
		Locale[] locales = Locale.getAvailableLocales();
		
		for (int i = 0; i < locales.length; i++) {
			
			//Laguage
			//System.out.println(locales[i].getLanguage());

			//Country
			//System.out.println(locales[i].getCountry());
			
			//display name
			//System.out.println(locales[i].getDisplayName());
		}
		
		
		//set locale
		Locale.setDefault(Locale.FRANCE);
		
		//default Locale
		Locale locale = Locale.getDefault();

		System.out.println(locale.toString());

	}

}
