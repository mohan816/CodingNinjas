package com.oops1.com;

import java.util.Scanner;

public class CalculatingValues {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Size of degree and coefficients");
		int n = s.nextInt();
		int degree1[] = new int[n];
		System.out.println("Values to degree");
		for(int i = 0; i < n; i++){
			degree1[i] = s.nextInt();
		}
		int coeff1[] = new int[n];
		System.out.println("Values to coefficient");
		for(int i = 0; i < n; i++){
			coeff1[i] = s.nextInt();
		}
		Polynomial first = new Polynomial();
		for(int i = 0; i < n; i++){
			first.setCoefficient(degree1[i],coeff1[i]);
		}
		first.print();
		System.out.println("Size of degree and coefficient of 2");
		n = s.nextInt();
		int degree2[] = new int[n];
		for(int i = 0; i < n; i++){
			degree2[i] = s.nextInt();
		}
		 int coeff2[] = new int[n];
		for(int i = 0; i < n; i++){
			coeff2[i] = s.nextInt();
		}
		Polynomial second = new Polynomial();
		for(int i = 0; i < n; i++){
			second.setCoefficient(degree2[i],coeff2[i]);
		}
		second.print();
		System.out.println("After adding first and second");
		//first.print();
		
		int choice = s.nextInt();
		Polynomial result;
		//result = first.add(second);
		System.out.println("Printing the results for sub");
		result = first.sub(second);
		result.print();
		/*switch(choice){
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
		}*/


}
}
