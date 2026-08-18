package com.recursion.coding;

public class RemoveX {
	
	/*
	 * Given a string, compute recursively a new string where all 'x' chars have been removed.
	 * 
	 * 1) If the length of the String is 0, return the empty String. It is the base condition
	 * 2) Call the induction hypothesis step, till the length is zero
	 * 3) In the induction step, just check character at index 0 is x, if it's true then simply return the smallOutput
	 *    If not just append that character to the smallOutput and return it.
	 */
	
	public static String removeX(String s) {
		if(s.length() == 0)
			return "";
		String smallOutput = removeX(s.substring(1));
		if(s.charAt(0) == 'x')
			return smallOutput;
		else
			return s.charAt(0) + smallOutput; 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String s = "Mohxnrxjxn";
         System.out.println(removeX(s));
	}

}
