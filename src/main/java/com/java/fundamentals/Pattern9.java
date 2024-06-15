package com.java.fundamentals;

import java.util.Scanner;

public class Pattern9 {

	public static void main(String[] args) {
	Scanner sn = new Scanner(System.in);
	int userInput = sn.nextInt();
	int i = 1;
	int dummy = userInput;
	while( i <= userInput) {
	int j = 1;
		while(j <= userInput + 1 - i) {
			System.out.print(j);
			j = j + 1;
			}
		int star = 1;
		while(star < i) {
			System.out.print('*');
			star = star + 1;
		}
		int rev = i;
		while(rev <= userInput) {
			System.out.print(userInput + 1 - rev);
			rev = rev + 1;
			}
		System.out.println();
		i = i + 1;
	}
	}
}
