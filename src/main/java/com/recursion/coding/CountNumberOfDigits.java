package com.recursion.coding;

public class CountNumberOfDigits {
	
	/*
	 * 1) Base condition, when the number is in single digit and divide it by 10 gives value as Zero if it's true return 1, because the number
	 * is single digit.
	 * 2) Just call the function and pass the argument n/10, because it gives the quotient to the function.
	 * 3) Then in the induction step, just add 1 with the function returned value.
	 */
	//Note: Have a look at Math.log functions
	public static int countNumberOfDigits(int n) {
		if(n/10 == 0)
			return 1;
		int count = countNumberOfDigits(n/10);
		return 1 + count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("Number of digits "+countNumberOfDigits(0001));
	}

}
