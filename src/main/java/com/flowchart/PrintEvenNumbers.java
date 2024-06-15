package com.flowchart;

public class PrintEvenNumbers {
	
	public static void printEvenNumbers(int n) {
		
		for(int i=1; i<=n; i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
	}

	public static void main(String[] args) {
		System.out.println("Even Numbers are ");
		printEvenNumbers(10);

	}

}
