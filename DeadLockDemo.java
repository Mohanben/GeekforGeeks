package com.geekforgeeks.main;

import java.util.ArrayList;

/**
 * @author z017954
 * 
 */
public class DeadLockDemo {
	public static ArrayList arrayList;
	static Thread thread;

	public static void main(String[] args) {
		arrayList = new ArrayList();
		MySampleThread lockDemo = new MySampleThread();
		thread = new Thread(lockDemo);
		thread.start();
		System.out.println(Thread.currentThread().getName());
		for (int i = 0; i < 100000; i++) {
			arrayList.add(Integer.valueOf(i));
		}
	}

	public static ArrayList getArrayList() {
		return arrayList;
	}

	public static void setArrayList(ArrayList arrayList) {
		DeadLockDemo.arrayList = arrayList;
	}

}

class MySampleThread implements Runnable {
	DeadLockDemo deadLockDemo = new DeadLockDemo();

	public void run() {
		for (int i = 0; i < 100000; i++) {
			System.out.println(deadLockDemo.getArrayList().get(i));
		}
	}
}
