package com.flowchart;

public class FindProduct {

	public static void main(String[] args) {
		int n = 5;
		int fact = n;
		for(int i = 1; i < n; i++) {
			fact = fact*i;
		}
		System.out.println(fact);
	}

}
