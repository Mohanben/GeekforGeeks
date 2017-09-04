/**
 * 
 */
package com.geekforgeeks.main;

import java.util.Scanner;

/**
 * @author z017954
 * 
 */
public class DeleteArrayElementsDemo {
	private static int[] array = { 1, 20, 30, 100, 3 };

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int arraySize = array.length;
		System.out.println("Enter the Elemets to delete from Array");
		int element = scanner.nextInt();
		int temp = 0;
		int newSizeOfArray = 0;
		for (int i = 0; i < arraySize; i++) {
			if (element == array[i]) {
				newSizeOfArray = arraySize - i;
				for (int j = 0; j < newSizeOfArray; j++) {
					temp = array[j];
					array[j] = array[j + 1];
				}
			}
		}
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		scanner.close();
	}

}
