package com.recursion.coding;

public class SumOfDigits {
	
	/*
	 * 1) base case : if input is zero then return 0. Because we have to get each number from starting right so we have to traverse all the num
	 * bers in the digit and get the last number on each traversal.
	 * 2) Create sum variable and add the digit, so num % 10 assign it to sum variable.
	 * 3) Induction Hypothesis: Just call  the function till num == 0
	 * 4) return the sum + output
	 */
	
	public static int sumOfDigits(int number) {
		if(number == 0)
			return 0;
		int sum = 0;
		sum += number % 10;
		return sum + sumOfDigits(number / 10);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sumOfDigits(-1987654321));

	}

}
