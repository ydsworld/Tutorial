package com.ydsworld.Locales;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;

public class ListOfCountryNames {

	public static void main(String[] args) {
		List<Country> countries = new ArrayList<Country>();
		
		Locale[] locales = Locale.getAvailableLocales();
		
	
		try {
			for(Locale locale : locales){
				String iso = locale.getISO3Country();
				String code = locale.getCountry();
				String name = locale.getDisplayCountry();
				
				if(!"".equals(iso) && !"".equals(code) & !"".equals(name)){
					countries.add(new Country(iso,code,name));
				}
			}
		} catch (MissingResourceException e) {
			// TODO: handle exception
		}
		
		Collections.sort(countries,new CountryComparator());
		for(Country country : countries){
			System.out.println(country);
		}

	}

}

class CountryComparator implements Comparator<Country>{

	private Comparator comparator;
	
	public CountryComparator() {
		comparator = Collator.getInstance();
	}
	
	
	@Override
	public int compare(Country o1, Country o2) {
		return comparator.compare(o1.name, o2.name);
	}
	
}

class Country{
	private String iso;
	private String code;
	public String name;
	
	Country(String iso, String code, String name){
		this.iso = iso;
		this.code = code;
		this.name = name;
	}
	
	public String toString(){
		return iso + " - " + code + " - " + name.toUpperCase(); 
	}
}