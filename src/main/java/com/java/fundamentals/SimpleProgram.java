package com.java.fundamentals;

public class SimpleProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 0, 2};
		for (int ele : arr){
		try{ //This block might raise an exception while executing
		System.out.println("The entry is" + ele);
		int r = 1/ele;
		System.out.println(r);
		}
		catch(Exception a) { //This block executes in case of an
		// exception in "try"
		System.out.println("Oops! An error occurred: "+a.toString());
		}
		System.out.println();
		}

	}

}
