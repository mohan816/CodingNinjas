package com.flowchart;

public class FibonnaciNumber {

	public static void fibonnaciNumber(int n) {
		int a=0;
		System.out.println(a);
		int b=1;
		System.out.println(b);
		
		for(int i=2; i<n; i++) {
			int c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
		
		
	}
	public static void main(String[] args) {
		System.out.println("Fibonnaci numbers are");
		fibonnaciNumber(10);

	}

}
