package com.java.fundamentals;

import java.util.Scanner;

public class Patterns {
	public static void printPattern() {
		Scanner sn = new Scanner(System.in);
		int n = sn.nextInt();
		int row = 1;
		while(row <= n) {
			int col = 1;
			while(col <= n) {
				if(col <= n + 1 - row) {
					System.out.print(col+" ");
					col++;
				}
				else {
					System.out.print('*'+" ");
					col++;
					
				}
			}
			int col2 = n;
			while(col2 >= 1) {
				if(col2 > n + 1 - row) {
					System.out.print('*'+" ");
					col2--;
				}
				else {
					System.out.print(col2+" ");
					col2--;
				}
			}
			row++;
			System.out.println();
		}
	}

	public static void main(String[] args) {
		printPattern();

	}

}
