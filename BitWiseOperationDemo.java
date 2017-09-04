/**
 * 
 */
package com.geekforgeeks.main;

/**
 * @author z017954
 * 
 */
public class BitWiseOperationDemo {

	public static void main(String[] args) {
		/*
		 * System.out.println(1111 & 1112); System.out.println(1 | 2);
		 * System.out.println(1 ^ 2);
		 */
		try {
			// int i = 100 / 0;
			main(args);
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		} catch (Throwable e) {
			System.out.println("Throwable " + e.getLocalizedMessage());
			String exception = e.getLocalizedMessage();
			throw new MyError(exception);
		}
		/*
		 * finally { System.out.println("Finally is called"); }
		 */
	}

}

class MyError extends Error {

	private static final long serialVersionUID = 1L;

	public MyError() {
		System.err.println("MyError Contructor is called");
	}

	public MyError(String exception) {
		super(exception);
		System.out.println("");
	}
}