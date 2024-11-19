package com.patterns.java;

import java.util.Scanner;

/* Print the following pattern for the given N number of rows.
   Pattern for N = 5
* * * * * 
 * * * *
  * * *
   * *
    *
 */

public class ReversePyramidPattern {
	
/*
 * parent for loop for number of rows
 * first inner for loop for number of spaces in each row
 * second inner for loop for number of * in each row
 */
	
public static void reversePyramidPattern(int n) {
	for(int i = 1; i <= n; i++) {
		for(int j = 1; j <= i - 1; j++)
			System.out.print(" ");
		for(int k = 1; k <= n - i + 1; k++)
			System.out.print("*"+" ");
		System.out.println();
	}
	
}
	
public static void main(String[] args) {
	System.out.println("Take the input from the user");
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	reversePyramidPattern(n);
}

}
