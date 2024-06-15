package com.oops1.com;

public class Car extends Bus {
	
	public Car(int maxSpeed) {
		super(maxSpeed);
	}
	
	void maxSpeed() {
		super.maxSpeed();
		System.out.println("max speed 150 ");
	}

}
