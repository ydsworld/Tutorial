package com.ydsworld.junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyEvenOddTest {

	@Test
	public void test() {
		MyEvenOdd meo = new MyEvenOdd();
		meo.isEvenNumber(13);
		//assertEquals("True", );
		 assertEquals(false, meo.isEvenNumber(13));
	}

}
