package com.patterns.java;

import java.util.Scanner;

public class FilledKShape {
	
	/* n = 4
4 3 2 1
3 2 1
2 1
1
2 1
3 2 1
4 3 2 1 
	 */
	
	/*
	 * 1) The problem is we have to print the output in the K shape and also have to follow the pattern to print the number.
	 * 2) For the first half we have to start from n and reduce it till it reaches 1 and in the each row assign i value to j and reduce it till 1
	 *    then go the next line and continue the same.
	 * 3) for the second half the outer loop has to execute till n - 1, and in the inner loop assign i + 1 and print it till reduce to 1.
	 *    then go to the next line and continue the same.
	 */
	
	public static void filledKShape(int n) {
		for(int i = n; i >= 1; i--) {
			for(int j = i; j >= 1; j--)
				System.out.print(j+" ");
			System.out.println();
		}
		for(int i = 1; i < n; i++) {
			for(int j = i + 1; j >= 1; j--)
				System.out.print(j+" ");
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Scanner sc = new Scanner(System.in);
          System.out.println("Take the input from the user");
          int n = sc.nextInt();
          filledKShape(n);
          
	}

}
