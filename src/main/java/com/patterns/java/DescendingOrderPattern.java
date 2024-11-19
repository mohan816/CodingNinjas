package com.patterns.java;

import java.util.Scanner;
/*
 * Problem statement
Print the following pattern for the given N number of rows.

Note: Print spaces between the numbers. Pattern for N = 5
5 
5 4 
5 4 3 
5 4 3 2 
5 4 3 2 1
 */

public class DescendingOrderPattern {
	
	public static void descendingOrderPattern(int n) {
		int i = 1;
		while(i <= n) {
			int count = n, j = 1;
			while(j <= i) {
				System.out.print(count--+" ");
				j++;
			}
			System.out.println();
			i++;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number n");
		int n = sc.nextInt();
		descendingOrderPattern(n);
	}

}
