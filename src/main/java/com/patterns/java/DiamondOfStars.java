package com.patterns.java;

import java.util.Scanner;

/* n = 10
     *
    ***
   *****
  *******
 *********
***********
 *********
  *******
   *****
    ***
     *
 */

public class DiamondOfStars {
	
	/*
	 * 1) If n = 10, then the first half will have half + 1 (n/2+1) number of rows and the second half will have half rows (n/2)
	 * 2) First we have to focus on spaces, for the first half the spaces will be decreased on each row and the second half the spaces will
	 * be increased on each  row. So here the idea for the first half is j = i, which means j will be improved on each row so that the number
	 * of spaces will be decreased. On the second half j = i, here the twist is i value will be decreased, so the j value also decreased but
	 * here the condition is j <= n/2 so the spaces will be increased by 1 on each rows.
	 * 3) In the first half for printing stars simply i * 2 is the condition, iterate from 1 and exit at < i * 2, so that on each rows
	 * the start count will be increased by 2.
	 * 4) In the second half the stars count have to decreased by 2 when compared to each rows, for this we have to do  < 2 * i
	 */
	
	public static void diamondOfStars(int n) {
		for(int i = 1; i <= n/2 + 1; i++) {
			for(int j = i; j < n/2 + 1; j++)
				System.out.print(" ");
			for(int k = 1; k < i * 2; k++) 
			    System.out.print("*");
			System.out.println();
		}
		for(int i = n/2; i >= 1; i--) {
			for(int j = i; j <= n/2; j++) 
			    System.out.print(" ");
			for(int k = 1; k < i * 2; k++)
				System.out.print("*");
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Take the input from the user");
		int n = sc.nextInt();
		diamondOfStars(n);
	}

}
