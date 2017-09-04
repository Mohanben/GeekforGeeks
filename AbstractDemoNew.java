package com.geekforgeeks.main;

import java.lang.Thread.State;

/**
 * @author z017954
 * 
 */
public class AbstractDemoNew {

	public static void main(String[] args) {
		NewDemo dem = new NewDem();
		dem.func();
	}

}

abstract class NewDemo {
	public void func() {
		System.out.println("Func is called");
	}
}

class NewDem extends NewDemo {
	public NewDem() {
		int XX = 0;
	}

	public void func() {
		System.err.println("Func is called");
	}

	static class innerClass {
		int x = 0;
	}
}

class moh {

}