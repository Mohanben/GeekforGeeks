package com.geekforgeeks.main;

import java.util.Scanner;

/**
 * @author z017954
 * 
 */
public class DeciamalToBinaryDemo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		toBinary(N);
		scanner.close();
	}

	private static void toBinary(int n) {
		System.out.println(Integer.toBinaryString(n));
	}

}
