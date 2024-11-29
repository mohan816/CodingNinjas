package com.patterns.java;

import java.util.Scanner;

/* n = 6
1 2 3 4 5 6 
 2 3 4 5 6 
  3 4 5 6 
   4 5 6 
    5 6 
     6 
    5 6 
   4 5 6 
  3 4 5 6 
 2 3 4 5 6 
1 2 3 4 5 6 
 */

public class HourGlassPattern {

	/*
	 * 1) We have to print this pattern in two half's, In the first half we have n rows, So the first outer for loop
	 *    we have to iterate it from 1 to n.
	 * 2) Then we have to print the spaces and in the each row the spaces are i - 1, for an example in the first row
	 *    we have no spaces (i = 1, so i - 1 = 0, it will be same for all the rows).
	 * 3) Then we have to print the element, the element start's with i in the each and ends with n.
	 * 4) In the second half, we have n - 1 rows, so the iteration must be i = 1 to n - 1.
	 * 5) Then the spaces are less than n - 1, so that in the second half first row it will be 4, then in the second row 3
	 *    and the same pattern will continue.
	 * 6) We have to print the element and it should n - i to n
	 * 
	 */
	
	public static void hourGlassPattern(int n) {
		//first half
		for(int i = 1; i <= n; i++) {
			//spaces
			for(int j = 1; j < i; j++)
				System.out.print(" ");
			//print numbers
			for(int k = i; k <= n; k++)
				System.out.print(k+" ");
			System.out.println();
		}
		//SecondHalf
		for(int i = 1; i <= n - 1; i++) {
			//spaces
			for(int j = 1; j < n - i; j++)
				System.out.print(" ");
			//print numbers
			for(int k = n - i; k <= n; k++)
				System.out.print(k+" ");
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Take the input from the user");
		int n = sc.nextInt();
		hourGlassPattern(n);
		
	}
}
