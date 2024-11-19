package com.patterns.java;

import java.util.Scanner;

/*
 * Print the following pattern for the given N number of rows.
Pattern for N = 3
321
321
321
 */
public class SquareOfPatterns {
	/*
	 * Going to solve the problem using while loop
	 *   1) Outer while loop for number of iterations(Ex: Number of rows)
	 *   2) Inner while loop for printing the values in the column
	 *   3) If the given number is 5 then each rows the number has to start from 5 and it has to end at 1, for all the five rows
	 */
	
	public static void squareOfPatterns(int n) {
		int i = 0;
		while(i < n) {
			int j = 5;
			while(j > 0) {
				System.out.print(j--);
			}
			System.out.println();
			i++;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number n");
		int n = sc.nextInt();
		squareOfPatterns(n);
		
	}

}
