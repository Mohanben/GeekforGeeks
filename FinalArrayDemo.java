package com.geekforgeeks.main;

/**
 * @author z017954
 * 
 */
public class FinalArrayDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final int[] array = { 1, 2, 3, 4, 5 };
		int[] array1 = { 10, 20, 30, 40, 50 };
		array1 = array;
		// array = array1;
		for (int i = 0; i < array1.length; i++) {
			System.out.println(array1[i]);
		}

		int a;
		Mohan mohan = new Mohan();
		System.out.println(mohan.i.hashCode());
		System.out.println(mohan.j.hashCode());
		if (mohan.i == mohan.j) {
			System.out.println("Same");
		} else {
			System.out.println("Not Same");
		}
	}

}

class Mohan {
	Mohan i;
	Mohan j = i;
}
