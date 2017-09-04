/**
 * 
 */
package com.geekforgeeks.main;

import java.util.Scanner;

/**
 * @author z017954
 * 
 */
public class JavaArrayDemo {

	private static int sum = 0;
	private static int average = 0;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int T = scanner.nextInt();
		for (int i = 0; i < T; i++) {
			int N = scanner.nextInt();
			for (int j = 0; j < N; j++) {
				int pi = scanner.nextInt();
				sum = sum + pi;
				average = sum / N;
			}
			System.out.println("Sum is " + sum);
			System.out.println("Average is " + average);
		}
		scanner.close();
	}

}
