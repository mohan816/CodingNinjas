package com.arrays.java;

import java.util.Scanner;

public class AssigningValuesFromScannerClass {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		int[] a = new int[5];
		for(int i = 0; i < a.length; i++) {
			System.out.println("Enter the number");
			a[i] = sn.nextInt();
		}
		System.out.print("Numbers are ");
		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}

	}

}
