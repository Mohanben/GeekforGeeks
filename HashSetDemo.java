package com.geekforgeeks.main;

import java.util.HashSet;

/**
 * @author z017954
 * 
 */
public class HashSetDemo {

	public static void main(String[] args) {
		HashSet hashSet = new HashSet();
		boolean b = hashSet.add("Mohan");
		boolean c = hashSet.add("GeekforGeeks");
		boolean d = hashSet.add("Mohan");
		System.err.println(b);
		System.err.println(c);
		System.err.println(d);
		System.out.println(hashSet);
	}

}
