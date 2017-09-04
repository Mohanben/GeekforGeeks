/**
 * 
 */
package com.geekforgeeks.main;

import java.util.Scanner;

/**
 * @author z017954
 * 
 */
public class MohanString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if (n >= 1 && n <= 200) {
			for (int i = 0; i < n; i++) {
				String s1 = sc.next();
				if (s1.length() >= 1 && s1.length() <= 10000) {
					int c = s1.charAt(0);
					if (c >= 65 && c <= 90) {
						s1 = s1.toUpperCase();
					}
					if (c >= 97 && c <= 122) {
						s1 = s1.toLowerCase();
					}
					System.out.println(s1);
				}
			}
		}

	}
}