/**
 * 
 */
package com.geekforgeeks.main;

/**
 * @author z017954
 * 
 */
public class InterfaceDemo {

	public static void main(String[] args) {
		Bike bike = new Bike();
		bike.changeSpeed(100);
		bike.applyBreaks(5);
		bike.changeGear(5);
		bike.getVehicleData();
	}
}

class Bike implements Vehicle {
	int speed;
	int gear;

	public void applyBreaks(int mbreak) {
		speed = speed - mbreak;
	}

	public void changeGear(int mGear) {
		gear = mGear;
	}

	public void changeSpeed(int mSpeed) {
		speed = speed + mSpeed;
	}

	public void getVehicleData() {
		System.out.println("Speed = " + speed + " Gear = " + gear);
	}

}

interface Vehicle {
	public static final int i = 90;

	void changeSpeed(int speed);

	public void changeGear(int gear);

	public void applyBreaks(int mBreak);
}