package com.geekforgeeks.main;

/**
 * @author z017954
 * 
 */
public class CrashOnJVMDemo {

	public static void main(String[] args) {
		Object[] o = null;

		while (true) {
			o = new Object[] { o };
		}
	}

}
