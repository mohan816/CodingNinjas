package com.java.fundamentals;

import java.util.Scanner;

public class Pattern8 {

	public static void main(String[] args) {
	Scanner sn = new Scanner(System.in);
	int userInput = sn.nextInt();
	int i = 1;
	while( i <= userInput) {
	
		int j = i;
		while(j <= userInput) {
			System.out.print('*');
			j = j + 1;
			}
		System.out.println();
		i = i + 1;
	}
	
	

	}

}
