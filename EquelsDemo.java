/**
 * 
 */
package com.geekforgeeks.main;

/**
 * @author z017954
 * 
 */
public class EquelsDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a = 1;
		int b = 0;
		String string = new String("Mohan");
		String string1 = new String("Mohan");
		System.out.println(string.hashCode());
		System.out.println(string1.hashCode());
		if (string.equals(string1)) {
			System.out.println("Same");
		} else {
			System.out.println("Not Same");
		}
	}

}
