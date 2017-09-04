package com.geekforgeeks.main;

/**
 * @author z017954
 * 
 */
public class MultipleThreadDemo {

	public static void main(String[] args) {
		for (int i = 0; i < 8; i++) {
			new MulpleThread().start();
		}
	}

}

class MulpleThread extends Thread implements Runnable {

	public void run() {
		try {
			System.out.println("THread " + Thread.currentThread().getId()
					+ " is Running");
		} catch (Exception e) {
			System.out.println("Exception is caught");
		}
	}
}

abstract class Saample {

	abstract void getValue();
}
