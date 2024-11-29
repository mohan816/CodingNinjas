package com.patterns.java;

import java.util.Scanner;

/*
Print the following pattern for the given number of rows.
Pattern for N = 5
E
DE
CDE
BCDE
ABCDE
 */

public class InterestingAlphabets {
	
	/*
	 * 1) We know we are going to have n number of rows
	 * 2) And in each rows the number of elements are equal to the number of rows (2nd row means 2 elements)
	 * 3) Here the logic is we have to use 'A' + n - j (Because the value of A is 65 and and the given example
	 *    the n value is 5 then we have to use minus j( j value is initialized with i).
	 */
	
	public static void interestingAlphabets(int n) {
		
		for(int i = 1; i <= n; i++) {
			for(int j = i; j >= 1; j--) {
				System.out.print((char)('A' + n - j));
			}
			System.out.println();
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Take the input from the user");
		int n = sc.nextInt();
		interestingAlphabets(n);

	}

}
