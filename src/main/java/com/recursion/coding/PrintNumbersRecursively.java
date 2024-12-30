package com.recursion.coding;

public class PrintNumbersRecursively {
	/*
	 * Given the number 'n', write a code to print numbers from 1 to n in increasing order recursively.
	 * 
	 * 1) Base condition, if n == 0, simply return
	 * 2) Call the induction hypothesis, with function argument n - 1
	 * 3) Then in the induction step, simply print n
	 */
	
	public static void printNumbers(int n) {
		if(n == 0)
			return;
		printNumbers(n - 1);
		System.out.print(n+" ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        printNumbers(30);
	}

}
