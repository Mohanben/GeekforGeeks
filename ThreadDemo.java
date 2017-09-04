package com.geekforgeeks.main;

/**
 * @author z017954
 * 
 */
public class ThreadDemo {
	private static Mythread mythread;

	public static void main(String[] args) {
		System.out.println("Main Thread ID " + Thread.currentThread().getId());
		System.out.println("Main Thread Name  "
				+ Thread.currentThread().getName());
		System.out.println("Main Thread Priority "
				+ Thread.currentThread().getPriority());
		mythread = new Mythread();
		Thread thread = new Thread(mythread);
		thread.start();
	}

}

class Mythread implements Runnable {
	public void run() {
		System.out.println("Child Thread ID " + Thread.currentThread().getId());
		System.out.println("Child Thread Name "
				+ Thread.currentThread().getName());
		System.out.println("Child Thread Priority "
				+ Thread.currentThread().getPriority());
		MythreadNew mythreadNew = new MythreadNew();
		Thread thread = new Thread(mythreadNew);
		thread.start();
		thread.setPriority(Thread.MIN_PRIORITY);
		try {
			thread.wait(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
		}
	}
}

class MythreadNew implements Runnable {
	public void run() {
		System.out
				.println("Child2 Thread ID " + Thread.currentThread().getId());
		System.out.println("Child2 Thread Name "
				+ Thread.currentThread().getName());
		System.out.println("Child2 Thread Priority "
				+ Thread.currentThread().getPriority());
	}
}
