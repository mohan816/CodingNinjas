package com.java.fundamentals;

public class PassByValue1 {
	
	static int a = 0;
	static int b = 0;
	
	public static void passByValue(int a, int b) {
		int c = a + b;
		System.out.println(c);
		a = 20;
		a = 30;
		print();
		
	}
	public static void print() {
		System.out.println(a);
		System.out.println(b);
	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 20;
		passByValue(a, b);
		System.out.println(a +" "+b);

	}

}
