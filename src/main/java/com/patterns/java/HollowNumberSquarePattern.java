package com.patterns.java;

import java.util.Scanner;

/*
 * Sample Input 1:
5
Sample Output 1:
12345
1   4
1   3
1   2
12345
*/

public class HollowNumberSquarePattern {
	/*
	 * For the first row and the last row print the numbers from 1 to n
	 * And in between rows print 1, then n - 2 spaces then print n - i + 1
	 */
	
	public static void hollowPattern(int n) {
		
		for(int i = 1; i <= n; i++) {
			System.out.print(1);
			if(i == 1 || i == n) {
				for(int j = 2; j <= n; j++)
					System.out.print(j);
				System.out.println();
				continue;
			}
			//spaces
			for(int j = 1; j <= n - 2; j++)
				System.out.print(" ");
			System.out.print(n - i + 1);
			System.out.println();
			
		}
		
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the number n");
	    int n = sc.nextInt();
	    hollowPattern(n);
	}

}
