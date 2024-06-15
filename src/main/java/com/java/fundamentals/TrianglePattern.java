package com.java.fundamentals;

import java.util.Scanner;

public class TrianglePattern {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		int n = sn.nextInt();
		int i = 1;
		while(i <= n) {
			int spaces = 1;
			while(spaces <= n - i) {
				System.out.print(" ");
				spaces = spaces + 1;
			}
			int j = 1;
			while(j <= i) {
				System.out.print('*');
				System.out.print(" ");
				j = j + 1;
			}
			System.out.println();
			i = i + 1;
			
		}

	}

}
