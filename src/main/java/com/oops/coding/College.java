package com.oops.coding;

public class College {

	public static void main(String[] args) {
		
		Student s1 = new Student(10,20);
		Student s2 = new Student(20,30);
		s1.add(s2);
		s1.print();

	}

}
