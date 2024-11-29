package com.patterns.java;

import java.util.Scanner;

/*
 * 5
Sample Output:
           1
          232
         34543
        4567654
       567898765
 */

public class TriangleNumberOfNumbers {
	
	/*
	 * The logic is, we have iterate the loop n times for n rows
	 *   1) First inner loop for spaces, and the spaces should be n - 1, for an example if n is 4, then in the first row we have to
	 *      print 3 spaces and in the second row two spaces and in the third row 1 spaces and the 4th row no spaces.
	 *   2) Second inner loop for printing the left angle triangle, so the logic is it has to print i elements in ith row.
	 *      for an example if the ith row is 2, then we have to print 2 elements there. in each row the the first element hasd to start
	 *      with i value, so here the logic i + k - 1
	 *   3) Third inner loop for right angle triangle, and the logic is if it's first row then no need to print anything
	 *      so the logic is the iteration should be < i, 2 * i - 1 - l (because we have to print the value and then we have to decrease it)
	 */
	
	public static void triangleNumberOfNumbers(int n) {
		for(int i = 1; i <= n; i++) {
			//spaces
			for(int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			//left angle triangle
			for(int k = 1; k <= i; k++) {
				System.out.print(i + k - 1);
			}
			//right angle triangle
			for(int l = 1; l < i; l++) {
				System.out.print(2 * i - 1 - l);
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Take the input from the user");
		int n = sc.nextInt();
		triangleNumberOfNumbers(n);
		
	}

}
