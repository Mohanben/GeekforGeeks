/**
 * 
 */
package com.geekforgeeks.main;

import java.util.Scanner;

/**
 * @author z017954
 * 
 */
public class DistinctObjectDemo {

	private static int[] arry;
	private static int[] newArry;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		arry = new int[N];
		newArry = new int[N];
		for (int i = 0; i < N; i++) {
			arry[i] = scanner.nextInt();
		}
		for (int i = 0; i < N; i++) {
			for (int j = 0; j <= i; j++) {
				if (arry[i] == arry[j]) {
					newArry[j] = arry[i];
				}
			}
		}
		for (int i = 0; i < N; i++) {
			System.out.println(newArry[i]);
		}
		scanner.close();
	}

}
