package com.java.fundamentals;

import java.util.Scanner;

public class Pattern5 {

	public static void main(String[] args) {
	Scanner sn = new Scanner(System.in);
	int userInput = sn.nextInt();
	int i = 1;
	char ch = 'A';
	while( i <= userInput) {
		int j = 1;
		char ch1 = ch;
		while(j <= userInput) {
			System.out.print(ch1);
			ch1 = (char)(ch1 + 1);
			j = j + 1;
			}
		System.out.println();
		ch = (char)(ch + 1);
		i = i + 1;
	}
	
	

	}

}
