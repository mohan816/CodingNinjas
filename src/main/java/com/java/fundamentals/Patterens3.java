package com.java.fundamentals;

import java.util.Scanner;

public class Patterens3 {
	
	/*
	 * 1 
	 * 1 1
	 * 2 0 2
	 * 3 0 0 3
	 */
	public static void printPattern() {
		Scanner sn = new Scanner(System.in);
		int n = sn.nextInt();
		int row = 1;
		System.out.println(1);
		while(row <= n - 1 ) {
			int col = 1;
			while(col <= row) {
				if(col == 1) {
					System.out.print(row+" ");
					col++;
				}
				else {
					System.out.print(0+" ");
					col++;
				}
			}
			int col2 = 1;
			while(col2 <= 1) {
				System.out.print(row+" ");
				col2++;
			}
			row++;
			System.out.println();
		}}
	

	public static void main(String[] args) {
		printPattern();

	}

}
