package com.patterns.java;

import java.util.Scanner;

/*
Print the following pattern for the given N number of rows.
Note :
print spaces between the numbers.
Pattern for N = 3
1 2 3 
2 3 1
3 1 2
*/

public class RotatePattern {
	
	/*
	 1) An idea is we have n number of rows, so the first for loop is for number of rows
	 2) And in each rows the first number starts with row no (ex: if row is 3, then it will start with 3), so i just print i
	 3) The second for loop will iterate till n - 1 times because first element is already printed.
	 4) I have added i + j add stored it in num variable and checked if the num is greater than n, if it's true
	    then simply subtracted num - n and printed it, if not then we have to num. if we follow this approach then we
	    will get the rotate pattern logic.
	 */

    public static void rotatePattern(int n) {
    	for(int i = 1; i <= n; i++) {
    		System.out.print(i+" ");
    	for(int j = 1; j <= n - 1; j++) {
    		int num = j + i;
    		if(num > n)
    			System.out.print(num - n + " ");
    		else
    	    System.out.print(num+" ");
    	}
    	System.out.println();
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println("Ask the input from the user ");
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       rotatePattern(n);
	}

}
