package com.geekforgeeks.main;

import java.io.Serializable;

/**
 * @author z017954
 * 
 */
public class ThrowsAndThrowDemo {

	public static void main(String[] args) {
		int oldCapacity = 6;
		int newCapacity = (oldCapacity * 3) / 2 + 1;
		System.out.println(newCapacity);
		a();
	}

	private static void a() {
		b();
		/*try {
			b();
		} catch (NullPointerException e) {
			System.out.println("NullPointer Exception is caught in a();");
		}*/
	}

	private static void b() {
		c();
		/*try {
			c();
		} catch (NullPointerException e) {
			System.out.println("NullPointer Exception is caught in b();");
			throw e;
		}*/
	}

	private static void c() {
	//	try {
			throw new NullPointerException("Null Pointer Exception");
		/*} catch (NullPointerException e) {
			System.out.println("NullPointer Exception is caught in c();");
			throw e;
		}*/
	}

}

class SeriesOfByte implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
