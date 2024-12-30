package com.recursion.coding;

public class IsPalindrome {
	
	/*
	 * 1) Here the logic is we have to compare zeroth index and the last index, then 1st index and last index - 1, 2nd index and last index - 2
	 *    like this it will continue. once the character's in the comparision are not matching then return false.
	 * 2) In the base once the index of both compare letters are crossed each other or at in the same index then return true.
	 * 3) Here the step is compare the values, if not matching then return -1.
	 * 4) Call the induction hypothesis, with arguments String and length - 1
	 * 
	 */
	
	public static boolean isPalindrome(String str) {
		return isPalindrome(str, str.length());
	}
	
	public static boolean isPalindrome(String str, int length) {
		if(str.length() - length >= length - 1)
			   return true;
		if(str.charAt(str.length() - length) != str.charAt(length - 1))
			   return false;
		return isPalindrome(str, length - 1);
	}
	
	public static void main(String[] args) {
		System.out.println(isPalindrome("abba"));
	}

}
