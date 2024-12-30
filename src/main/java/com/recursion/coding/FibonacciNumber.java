package com.recursion.coding;

public class FibonacciNumber {
	
	/*
	 * 1) Here the idea is we have to add two numbers to get the 3rd number, I mean to get n, we have to add n - 1 & n - 2.
	 * 2) So the base condition is if n == 1 return 0, n == 2 return 1, because the first two fibonacci numbers are 0 and 1
	 * 3) Then in the induction hypothesis we have to call n - 1 and n - 2, so that we can add both of them and return it.
	 * 4) In the induction step just add two recursive call's return value and return the sum of it.
	 */
	
	public static int fibonnaciNumbers(int n) {
		if(n <= 1)
			return 0;
		if(n == 2)
			return 1;
		int fibo_1 = fibonnaciNumbers(n-1);
		int fibo_2 = fibonnaciNumbers(n-2);
		return fibo_1 + fibo_2;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println(fibonnaciNumbers(5));
	}

}
