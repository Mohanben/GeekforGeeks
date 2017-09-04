/**
 * 
 */
package com.geekforgeeks.main;

/**
 * @author z017954
 * 
 */
public class MutipleThreadUsingRunnable {

	public static void main(String[] args) {
		for (int i = 0; i < 8; i++) {
			new MulpleThread().start();
		}
	}

}

class MultiThread implements Runnable {

	public void run() {
		System.out.println("Thread " + Thread.currentThread().getId()
				+ " is Running");
	}

}