package com.recursion.coding;

public class XToPowerN {
	
	/*
	 * 1) Base condition, anything power 0 is 1. 
	 * 2) Induction hypothesis just calling x and n - 1
	 * 3) Just multiplying x with the smallOutput, if x is 3 and n is 3 which means we have
	 *    to perform 3 * 3 * 3. So took base condition if n is 0 return 1(Anything power 0 is 1)
	 *    Called induction hypothesis step and proved for x by multiplying x with small output.
	 */
	
	public static int power(int x, int n) {
		if(n == 0)
			return 1;
		int smallOutput = power(x, n - 1);
		return x * smallOutput;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(power(3, 3));

	}

}
