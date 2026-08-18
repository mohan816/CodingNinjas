package com.recursion.coding;

/*
 * Given a string S, remove consecutive duplicates from it recursively. Constraints String length >= 1 to 10^3
 * 
 * 1) Base condition, if the length of the String is 1, then simply return it.
 * 2) Induction hypothesis, Call it till the length() is 1.
 * 3) Then just check if the character at index 0 is equals to character at index 0 of small output, if it's true return
 *    smallOutput else return s.charAt(0) + smallOutput
 */

public class RemoveDuplicates {
	
	public static String removeDuplicates(String s) {
		if(s.length() == 1)
			return s;
		String smallOutput = removeDuplicates(s.substring(1));
		if(s.charAt(0) == smallOutput.charAt(0))
			return smallOutput;
		else
			return s.charAt(0) + smallOutput;
	}
	
	
	
	public static void main(String[] args) {
		String s = "aaabbbccd";
		System.out.println(removeDuplicates(s));
	}

}
