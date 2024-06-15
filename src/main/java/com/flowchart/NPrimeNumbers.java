package com.flowchart;

public class NPrimeNumbers {
	
	public static void nPrimeNumbers(int n) {
		
		for(int i=2; i<=n; i++) {
			int count=0;
			for(int j=2; j<=i; j++) {
				if(i%j==0) {
					count=count+1;
				}
				}
			if(count==1) {
				System.out.println(i);
			}
		}
		
	}

	public static void main(String[] args) {
		System.out.println("Prime numbers in between 1 to 10 are ");
		nPrimeNumbers(10);

	}

}
