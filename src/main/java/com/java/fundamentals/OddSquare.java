package com.java.fundamentals;

import java.util.Scanner;

public class OddSquare {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		int n = sn.nextInt();
		int i = 1;
		while(i <= n){
			int j = i;
			int count = i;
			while(j <= n){
				System.out.print(count + i - 1);
				count = count + 2;
				j = j + 1;
			}
			int a = 1;
			int b = a;
			while( a < i) {
				System.out.print(b);
				b = b + 2;
				a = a + 1;
			}
			System.out.println();
			i = i + 1;
		}
	}
}


