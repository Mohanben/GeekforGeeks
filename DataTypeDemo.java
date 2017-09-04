/**
 * 
 */
package com.geekforgeeks.main;

import java.util.Scanner;

/**
 * @author z017954
 * 
 */
public class DataTypeDemo {
	private static int CONSTANT = 2;

	public static void main(String[] args) {
		byte b = 120;
		System.out.println(b);
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		double result = -CONSTANT * Math.pow(2, N - 1);
		double result1 = CONSTANT * Math.pow(2, N - 1) - 1;
		System.out.println(result + " to " + result1);
		scanner.close();
	}

}
