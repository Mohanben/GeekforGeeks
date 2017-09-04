/**
 * 
 */
package com.geekforgeeks.main;

import java.io.ObjectInputStream.GetField;
import java.util.Scanner;

/**
 * @author z017954
 * 
 */
public class CheckStringDemo {
	static String reverse = "";

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
			int T = scanner.nextInt();
			if (T == 0) {
				return;
			} else if (T >= 0 && T <= 200) {
				for (int i = 0; i < T; i++) {
					String input = scanner.next();
					int length = input.length();
					for (int j = length - 1; j >= 0; j--) {
						reverse = reverse + input.charAt(j);
					}
					if (input.equals(reverse)) {
						System.out.println("YES");
						reverse = "";
					} else {
						System.out.println("NO");
						reverse = "";
					}
				}
			}
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
		scanner.close();
	}

}
