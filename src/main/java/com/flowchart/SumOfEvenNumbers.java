package com.flowchart;

public class SumOfEvenNumbers {
	
	public static void sumOfEvenNumbers(int a) {
		int sum = 0;
		for(int i=2; i<=a; i++) {
			
			if(i<=a) {
				if(i%2==0) {
					sum=sum+i;
				}
			}
			
		}
		System.out.println("Total sum of even number is "+sum);
	}

	public static void main(String[] args) {
		sumOfEvenNumbers(10);

	}

}
