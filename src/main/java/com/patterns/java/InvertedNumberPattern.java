package com.patterns.java;
/*
Print the following pattern for the given N number of rows.
Pattern for N = 4
4444
333
22
1
*/

import java.util.Scanner;

public class InvertedNumberPattern {
	
	/*
	 * Three golden rules always have to remember, 1) Number of rows 2) Number of columns 3) What to print
	 * we have n number of rows, in each rows we have print to n - i + 1, n - i + 1 times.
	 */
	
	public static void invertedNumberPattern(int n) {
		
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n - i + 1; j++) {
				System.out.print(n - i + 1);
			}
			System.out.println();
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.println("Take the input from the user");
        int n = sc.nextInt();
        invertedNumberPattern(n);
	}

}
