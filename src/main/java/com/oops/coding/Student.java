package com.oops.coding;

public class Student {
	
 int numerator;
 int denominator;
 
 public Student(int numerator, int denominator) {
	 this.numerator = numerator;
	 this.denominator = denominator;
	 
 }
 
 public void add(Student s2) {
	 
	 this.numerator = this.numerator * s2.denominator + s2.numerator * this.denominator;
	 this.denominator = this.denominator * s2.denominator;
	 simplify();
 }
 
 
 
 public void simplify() {
	 int gcd = 1;
	 int smaller = Math.min(numerator, denominator);
	 for(int i = 2; i <= smaller; i++) {
		 if(numerator % i == 0 && denominator % i == 0) {
			 gcd = i;
		 }
	 }
	 this.numerator = this.numerator / gcd;
	 this.denominator = this.denominator / gcd;
 }
 
 public void print() {
	 System.out.println(numerator+"/"+denominator);
 }
	
	
	

}
