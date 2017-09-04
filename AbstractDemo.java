package com.geekforgeeks.main;

public class AbstractDemo {

	public static void main(String[] args)
			throws ArrayIndexOutOfBoundsException {
		try {
			sample();
		} catch (ArithmeticException e) {
			//throw new ArithmeticException("Arithmetic Exception");
		}
		Demo demo = new Demo() {
		};
		demo.demo();
		try {
			int i = 0;
			i = i / 0;
			throw new ArrayIndexOutOfBoundsException("Array is Exceed");
		} catch (ArrayIndexOutOfBoundsException e) {
		} catch (ArithmeticException arithmeticException) {
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public static void sample() throws ArithmeticException {
		System.out.println("Sample is called");
		int i = 1;
		i = i / 0;
	}

}

abstract class Demo {
	void demo() {
		System.out.println("demo func is called");
	}
}

class SubDemo extends Demo {
	void demo() {
		System.out.println("Sub demo is Called");
		new AbstractDemo().sample();
	}
}