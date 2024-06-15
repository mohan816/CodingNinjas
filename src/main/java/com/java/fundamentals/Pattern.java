package com.java.fundamentals;

import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
	Scanner sn = new Scanner(System.in);
	int userInput = sn.nextInt();
	int i = 1;
	while( i <= userInput) {
		int j = 1;
		while(j <= i) {
			System.out.print(j);
			j = j + 1;
			}
		System.out.println();
		i = i + 1;
	}
	
	

	}

}
