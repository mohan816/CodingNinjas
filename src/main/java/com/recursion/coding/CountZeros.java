package com.recursion.coding;

public class CountZeros {
	
	/*
	 * Here the idea is , if the given number is 0, then return 1. if the given number is >= 1 && <= 9, then return 0. This is the base case
	 * we solved it for small input.
	 * Here we are doing small calculation that if the number % 10 == 0 then add count by 1.
	 * I am doing the recursive call, by sending dividing the argument with 10.
	 * finally add count + smallOutput, and simply return it.
	 */
	
	public static int countZeros(int input) {
		if(input == 0)
			return 1;
		if(input <= 9)
			return 0;
		int count = 0;
		if(input % 10 == 0)
			count++;
		int smallOutput = countZeros(input / 10);
		return count + smallOutput;
	}
	
	
	public static void main(String[] args) {
	    System.out.println(countZeros(10234));
	}

}
