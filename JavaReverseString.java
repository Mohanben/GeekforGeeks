/**
 * 
 */
package com.geekforgeeks.main;

import java.net.CacheRequest;
import java.util.Scanner;

/**
 * @author z017954
 * 
 */
public class JavaReverseString {
	private static String concat = "";
	private static String reverseString = "";
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int T = scanner.nextInt();
		if (T < 0) {
			return;
		} else if (T > 0) {
			for (int i = 0; i < T; i++) {
				String inputString = scanner.next();
				String inputString2 = scanner.next();
				concat = inputString.concat(inputString2);
				for (int j = concat.length() - 1; j >= 0; j--) {
					reverseString = reverseString + concat.charAt(j);
				}
				System.out.println(reverseString);
				reverseString = "";
			}
		}
		scanner.close();
	}

}
