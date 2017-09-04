/**
 * 
 */
package com.geekforgeeks.main;

/**
 * @author z017954
 * 
 */

class Sender {
	void send(String message) {
		System.out.println(message);
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}

public class SynchronizationBlockDemo {

	public static void main(String[] args) {
		Sender sender = new Sender();
		SynchThread synchThread = new SynchThread("Hi", sender);
		SynchThread synchThread1 = new SynchThread("Bye", sender);
		Thread thread = new Thread(synchThread);
		Thread thread1 = new Thread(synchThread1);
		thread.start();
		thread1.start();
	}

}

class SynchThread implements Runnable {
	String mesg;
	Sender sender;

	SynchThread(String mesg, Sender obj) {
		this.mesg = mesg;
		this.sender = obj;
	}

	public void run() {
		synchronized (sender) {
			System.out.println("Sending " + mesg);
			sender.send(mesg);
		}
	}
}