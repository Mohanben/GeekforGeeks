package com.geekforgeeks.main;

import java.sql.Struct;

public class ThrowsException {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			a();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("" + e.getLocalizedMessage());
		}
	}

	private static void a() throws Exception {
		try {
			b();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			throw new MainException("sdjhsdjhsdjhskdj");
		}

	}

	private static void b() throws Exception {
		try {
			c();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			throw new Exception(" Null Exception");
		}

	}

	private static void c() throws Exception {
		try {
			throw new Exception("IO Exception");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			throw e;
		}
	}
}

class MainException extends Exception {
	public MainException() {
		System.err.println("Exception is happeda");
	}

	public MainException(String string) {
		super(string);
	}
}
