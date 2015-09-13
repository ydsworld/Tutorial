package com.ydsworld.Exception;

public class BadAgeException extends Exception {
	
	private int age;
	
	
	public BadAgeException(int age) {
		super();
		this.age = age;
	}

	@Override
	public String getMessage(){
		
		try
	      {
	         throw new Exception("Who called me?");
	      }
	      catch( Exception e )
	      {
	         System.out.println( "I was called by " + 
	                             e.getStackTrace()[1].getClassName() + 
	                             "." +
	                             e.getStackTrace()[1].getMethodName() + 
	                             "()!" );
	         System.err.println();
	      }
		
		//System.err.println(new Exception().getStackTrace()[1].getClass());
		
		return "You Provided an Invalid Age" + this.age;
	}

}
