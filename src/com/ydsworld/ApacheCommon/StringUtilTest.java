package com.ydsworld.ApacheCommon;

import org.apache.commons.lang.StringUtils;

public class StringUtilTest {
	private static String MASTER_STRING = "Main String";

	public static void main(String[] args) {
		compare(new String());
	}

	public static void compare(String str) {
		if (StringUtils.isNotBlank(str)) {
			if (StringUtils.equals(MASTER_STRING, str)) {
				System.out.println(MASTER_STRING + " = " + str);
			} else {
				System.err.println(MASTER_STRING + " != " + str);
			}
		} else {
			System.err.println("str is Null");
		}
	}	//compare
}	//class
