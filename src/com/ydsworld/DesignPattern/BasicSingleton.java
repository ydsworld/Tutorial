package com.ydsworld.DesignPattern;

public class BasicSingleton {
	static Singleton s1 = null, s2 = null;

	  public static void main(String[] args) {
	    s1 = Singleton.getInstance();
	    s2 = Singleton.getInstance();

	  }
}

class Singleton {
	  private static Singleton mySingleton = null;

	  private Singleton() {
	  }

	  public static synchronized Singleton getInstance() {
	    if (null == mySingleton) {
	      mySingleton = new Singleton();
	      System.out.println(mySingleton.toString());
	    } else {
	      System.out.println(mySingleton.toString());

	    }
	    return mySingleton;

	  }
	}