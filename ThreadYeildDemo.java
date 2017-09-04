package com.geekforgeeks.main;

/**
 * @author z017954
 * 
 */
public class ThreadYeildDemo {

	public static void main(String[] args) {
		ChildThread childThread = new ChildThread();
		Thread thread = new Thread(childThread);
		thread.start();
		Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
		for (int i = 0; i < 5; i++) {
			// Thread.yield();
			// System.out.println(thread.getState() +"----------");
			System.out
					.println(Thread.currentThread().getName() + " In Control");
		}
	}

}

class ChildThread implements Runnable {
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out
					.println(Thread.currentThread().getName() + " In Control");
		}
	}
}