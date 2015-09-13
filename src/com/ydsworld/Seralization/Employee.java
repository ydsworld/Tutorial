package com.ydsworld.Seralization;

public class Employee implements java.io.Serializable{
	
	   /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public String name;
	   public String address;
	   public transient int SSN; //this will not serialized.
	   public int number;
	   
	   public void mailCheck()
	   {
	      System.out.println("Mailing a check to " + name + " " + address);
	   }
}
