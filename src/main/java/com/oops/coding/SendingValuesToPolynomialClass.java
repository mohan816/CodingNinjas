package com.oops.coding;

import java.util.Scanner;

public class SendingValuesToPolynomialClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number of coefficeints for degree 1");
		int n = s.nextInt();
		int degree1[] = new int[n];
		for(int i = 0; i < n; i++){
			System.out.println("Enter degrees ");
			degree1[i] = s.nextInt();
		}
		int coeff1[] = new int[n];
		for(int i = 0; i < n; i++){
			System.out.println("Enter coefficients ");
			coeff1[i] = s.nextInt();
		}
		Polynomial first = new Polynomial();
		System.out.println(first);
		for(int i = 0; i < n; i++){
			first.setCoefficient(degree1[i],coeff1[i]);
			//System.out.println(first.data.length);
		}
		System.out.println("first data length " +first.data.length);
		System.out.println("Enter number of coefficeints for degree 2");
		n = s.nextInt();
		int degree2[] = new int[n];
		for(int i = 0; i < n; i++){
			System.out.println("Enter degrees ");
			degree2[i] = s.nextInt();
		}
		 int coeff2[] = new int[n];
		for(int i = 0; i < n; i++){
			System.out.println("Enter coefficients ");
			coeff2[i] = s.nextInt();
		}
		Polynomial second = new Polynomial();
		System.out.println(second);
		for(int i = 0; i < n; i++){
			second.setCoefficient(degree2[i],coeff2[i]);
		}
		System.out.println("Second data length "+second.data.length);
		System.out.println("Enter choice has 1");
		int choice = s.nextInt();
		Polynomial result;
		switch(choice){
		// Add
		case 1: 
			 result = first.add(second);
			result.print();
			break;
		// Subtract	
		case 2 :
			 result = first.subtract(second);
			result.print();
			break;
		// Multiply
		case 3 :
			 result = first.multiply(second);
			result.print();
			break;
		}
		/*
		 * 3 3 1 7 1 2 3 2 2 1 7 8 1
		 */
	}

}
