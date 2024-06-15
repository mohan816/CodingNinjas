package com.flowchart;

public class DifferentTypesOfTriangle {
	
	public static void typesOfTriangle(int a, int b, int c) {
		
		if(a==b && a==c && b==c) {
			System.out.println("It is a equilateral triangle");
		}
		else if(a!=b && a!=c && b!=c) {
			System.out.println("It is a scalene triangle");
		}
		else if(a==b || a==c || b==c) {
			System.out.println("It is a isosceles triangle");
		}
	}

	public static void main(String[] args) {
		typesOfTriangle(10, 20, 20);

	}

}
