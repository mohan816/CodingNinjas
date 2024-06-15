package com.flowchart;

public class PrimeNumbers {
	
	public static void primeNumber(int n) {
		for(int i=2; i<=n; i++) {
			if(i<n) {
			if(n%i==0) {
				System.out.println("It is not a prime number");
				break;
			}
			//else
			//	;
			}
			else 
				System.out.println("It is a prime number");
			
			}
			
		}
	


	public static void main(String[] args) {
		primeNumber(25);

	}

}
