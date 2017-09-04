/**
 * 
 */
package com.geekforgeeks.main;

/**
 * @author z017954
 * 
 */
public class OutofMemoryExceptionDemo {

	public static void main(String[] args) {

		try {
			a();
			throw new OutOfMemoryError("Out of memeory Ecxception");
		} catch (Exception e) {
			System.err.println(e.getLocalizedMessage());
		} catch (OutOfMemoryError e) {
			System.out.println("Throwable --- " + e.getLocalizedMessage());
		} catch (StackOverflowError e) {
			System.err.println(e.getLocalizedMessage());
		}
	}

	private static void a() throws StackOverflowError {
		try {
			b();
		} catch (StackOverflowError e) {
			throw new StackOverflowError("StackOverflow Error");
		} catch (InternalError e) {
			System.out.println(e.getLocalizedMessage());
		}
	}

	private static void b() throws InternalError {
		throw new InternalError("Internal Error");
	}

}