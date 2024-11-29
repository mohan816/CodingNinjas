package com.patterns.java;

import java.util.Scanner;

/*
 * A Pascal's triangle is a triangular array constructed by summing adjacent elements in preceding rows. 
 * Pascal's triangle contains the values of the binomial coefficient. For example in the figure below.
   For example, given integer N= 4 then you have to print.
   1 
  1 1 
 1 2 1 
1 3 3 1 
 */

public class PascalsTriangle {
	/*
	 * 1) The logic is the first row we have to print 1 and in the second row 1 1 and in the third row 1 2 1 and it will continue till the n rows
	 *    so in the inner loop we have to initialize with 1 and loop exit once it crossed i value, because in each row we have to print i elements.
	 *    
	 * 2) Initialize a variable with value 1 and once entered into the loop print the variable then perform the logical operation and assign
	 *    that value back to the variable, the logic here is variable * i - k / k (Here i is the outerloop value and k is the inner loop value)
	 */
	
	public static void pascalsTriangle(int n) {
		for(int i = 1; i <= n; i++) {
			//spaces
			for(int j = i; j < n; j++)
				System.out.print(" ");
			int number = 1;
			for(int k = 1; k <= i; k++) {
				System.out.print(number+" ");
				number = number * (i - k) / k;
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc = new Scanner(System.in);
         System.out.println("Take the input from the user");
         int n = sc.nextInt();
         pascalsTriangle(n);
         
	}

}
