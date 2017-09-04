package com.geekforgeeks.main;

import java.util.Scanner;

/**
 * @author z017954
 * 
 */

/*
 * 
 * 1.Insert elements 2.delete Elements 3.Find Elements
 */
public class ArrayOperationDemo {
	private static int[] array;
	private static Scanner scanner;
	private static int option;
	private static int elementSize;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		basicOperation();
		scanner.close();
	}

	private static void basicOperation() {
		System.out.println("Enter the operation do you want to do");
		System.out.println("1.Insert Operation");
		System.out.println("2.Delete operation");
		System.out.println("3.Find Elements");
		System.out.println("4. Display");
		option = scanner.nextInt();
		switch (option) {
		case 1:
			insertElement();
			break;
		case 2:
			deleteElement();
			break;
		case 3:
			findElement();
			break;
		case 4:
			displayElement();
		default:
			break;
		}

	}

	private static void displayElement() {
		for (int i = 0; i < array.length; i++) {
			System.out.println("\t" + array[i]);
		}
		basicOperation();
	}

	private static void findElement() {
		int findElement = scanner.nextInt();
		for (int i = 0; i < array.length; i++) {
			if (array[i] == findElement) {
				System.out.println("Element is exist");
			}
		}
	}

	private static void deleteElement() {
		
	}

	private static void insertElement() {
		System.out.println("Enter the No Of Element to insert");
		elementSize = scanner.nextInt();
		array = new int[elementSize];
		for (int i = 0; i < elementSize; i++) {
			array[i] = scanner.nextInt();
		}
		basicOperation();
	}

}
