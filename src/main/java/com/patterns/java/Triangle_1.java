package com.patterns.java;

import java.util.Scanner;

/*
 * Print the following pattern for the given N number of rows.
Pattern for N = 3
1
22
333
 */

public class Triangle_1 {
	/*
	 * First for loop for number of rows
	 * And the second for loop for printing the numbers in each row
	 */
	public static void triangle1(int n) {
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the number n");
       int n = sc.nextInt();
       triangle1(n);
       
	}

}
