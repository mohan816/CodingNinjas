package com.java.fundamentals;

import java.util.Scanner;

public class Pattern3 {

	public static void main(String[] args) {
	Scanner sn = new Scanner(System.in);
	int userInput = sn.nextInt();
	int i = 1;
	int n = 1;
	while( i <= userInput) {
		int j = 1;
		while(j <= i) {
			System.out.print(n+" ");
			n = n + 1;
			j = j + 1;
			}
		System.out.println();
		i = i + 1;
	}
	
	

	}

}
