package com.patterns.java;

import java.util.Scanner;

/*
 * Print the following pattern for the given N number of rows.
Pattern for N = 3
###
###
###
 */
public class GameOfPattern {
	/*
	 * Golden rules
	 *  1) Number of rows to print
	 *  2) Number of columns to print
	 *  3) What we have to print
	 *  
	 *  In this problem we have to print #
	 */
	
	public static void gameOfPattern(int n) {
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				System.out.print('#'+"");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the n value");
		int n = sc.nextInt();
		gameOfPattern(n);
	}
}
