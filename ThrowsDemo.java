/**
 * 
 */
package com.geekforgeeks.main;

/**
 * @author z017954
 * 
 */
public class ThrowsDemo implements sample.ChildSample.NestedInterface {

	/**
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		int i = 1 / 0;
	}

	public void childSample() {
		// TODO Auto-generated method stub

	}

	public void nestedVoid() {
		// TODO Auto-generated method stub

	}

}

interface sample {
	public void doSample();

	interface ChildSample {
		public void childSample();

		interface NestedInterface {
			public void nestedVoid();
		}
	}
}