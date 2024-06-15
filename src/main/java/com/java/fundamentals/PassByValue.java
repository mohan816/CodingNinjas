package com.java.fundamentals;

public class PassByValue {
	
	public static int addNumbers(int a, int b) {
		int c = a + b;
		return c;
		
	}

	public static void main(String[] args) {
		int c = 10, d = 20;
		 c = addNumbers(c, d);
		System.out.println(c);
	}

}
