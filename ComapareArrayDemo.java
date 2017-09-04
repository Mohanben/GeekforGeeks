/**
 * 
 */
package com.geekforgeeks.main;

import java.util.Arrays;

/**
 * @author z017954
 * 
 */
public class ComapareArrayDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] array1 = { 1, 2, 3, 4 };
		int[] array2 = { 1, 2, 3, 4 };
		System.out.println(array1.hashCode());
		System.out.println(array2.hashCode());
		if (Arrays.equals(array1, array2)) {
			System.err.println("Same");
		} else {
			System.err.println("Not Same");
		}
	}

}
