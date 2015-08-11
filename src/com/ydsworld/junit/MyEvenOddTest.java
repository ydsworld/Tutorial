package com.ydsworld.junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyEvenOddTest {

	@Test
	public void test() {
		CheckEvenOdd meo = new CheckEvenOdd();
		meo.isEvenNumber(13);
		//assertEquals("True", );
		 assertEquals(false, meo.isEvenNumber(13));
	}

}

class CheckEvenOdd {

	public boolean isEvenNumber(int number){
		if (number%2 == 0){
			return true;
		} else {
			return false;
		}
	}
}