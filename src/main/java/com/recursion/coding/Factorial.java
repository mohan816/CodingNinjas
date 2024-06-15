package com.recursion.coding;

public class Factorial {
	
	
	public static int factorial(int n) {
		if(n == 1) {
			return 1;
		}
		int smallOutput = factorial(n-1);
		int count = n * smallOutput;
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int n = factorial(5);
         System.out.println(n);
	}

}
