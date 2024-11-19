package com.patterns.java;

import java.util.Scanner;

/*
 * Print the following pattern for the given N number of rows.

Pattern for N = 4
   1
  2 2
 3 3 3
4 4 4 4
 */

public class PyramidOfNumbers {
	/*
	 * The idea is we have n number of rows, and in each row we have to print i, i times
	 * In the first column we have to print(n - i) spaces and then i
	 * In the second column we have to print(n - i) spaces then remaining i
	 */
	
	public static void pyramidOfNumbers(int n) {
		
		for(int i = 1; i <= n; i++) {
			for(int j = n; j >= 1; j--) {
				if(j <= i) {
					System.out.print(i);
				}
				System.out.print(" ");
			}
			System.out.println();
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number n");
        int n = sc.nextInt();
        pyramidOfNumbers(n);
	}

}
