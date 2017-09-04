/**
 * 
 */
package com.geekforgeeks.main;

import java.util.Scanner;

/**
 * @author z017954
 * 
 */
public class InstinctArrayNumberDemo {
	private static int[] array, newArray;
	private static Scanner scanner;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		array = new int[N];
		newArray = new int[N];
		// System.out.println(findDistinctNumber(N));
		int arr[] = findDistinctNumber(N);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		scanner.close();
	}

	private static int[] findDistinctNumber(int N) {

		if (N == 0) {
			return array;
		} else if (N <= 200) {
			for (int i = 0; i <= N - 1; i++) {
				array[i] = scanner.nextInt();
			}
			for (int i = 0; i < array.length; i++) {
				for (int j = 0; j <= i; j++) {
					if (array[i] == array[j]) {
						newArray[i] = array[i];
					}
				}
			}
		}
		return array;

	}
}
