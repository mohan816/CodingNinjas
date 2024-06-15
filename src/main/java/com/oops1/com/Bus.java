package com.oops1.com;

public class Bus {
	int maxSpeed;
	
	public Bus(int maxSpeed) {
		this.maxSpeed = maxSpeed;
		System.out.println(maxSpeed +" From the constructor");
	}

	void maxSpeed() {
		System.out.println(maxSpeed);
	}
}
