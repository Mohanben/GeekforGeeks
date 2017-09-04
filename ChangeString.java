/**
 * 
 */
package com.geekforgeeks.main;

import java.util.Scanner;

/**
 * @author z017954
 * 
 */
public class ChangeString {
	private static String inputString;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
			int T = scanner.nextInt();
			if (T < 200) {
				for (int i = 0; i < T; i++) {
					inputString = scanner.next();
					if (inputString.length() < Math.pow(10, 4)) {
						char a = inputString.charAt(0);
						if (Character.isUpperCase(a)) {
							System.out.println(inputString.toUpperCase());
						} else {
							System.out.println(inputString.toLowerCase());
						}
					}
				}
			}
		} catch (Exception e) {
			System.err.println("Exception is " + e.getLocalizedMessage());
		}
		scanner.close();
	}

}
