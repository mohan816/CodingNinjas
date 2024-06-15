package com.java.fundamentals;

import java.util.Scanner;

public class UsingScanner {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the first Name");
		String firstName = s.nextLine();
		System.out.println("Enter the lastName");
		String lastName = s.nextLine();
		System.out.println("Enter the age");
		int age = s.nextInt();
		
		
		
		System.out.println("First Name is "+ firstName + " his age is "+ age + " and the last name is "+ lastName +" ");

	}

}
