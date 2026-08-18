package com.recursion.coding;

public class ReplaceCharacter {
	
	/*
	 * 1) Here the idea is whenever we find the original character then we have to replace it with replacement character.
	 * 2) We are going traverse the String until it length becomes zero, once the string length is zero then we have to return empty string
	 * 3) To reduce the length of the String by 1 on each recursive call, we have to use substring with begin index 1. So that on each call
	 *    it remove the zeroth index char, and it send the remaining String to the function.
	 * 4) On the induction step, just have to check 0th index position character is original character, if it's true then just return replacement
	 *    character + smallOutput, if not append 0th index character with small output and return it.
	 */
	public static String replaceChar(String s, char original, char replacement) {
		if(s.length() == 0)
			return "";
		String smallOutput = replaceChar(s.substring(1), original, replacement);
		if(s.charAt(0) == original)
			  return replacement + smallOutput;
		else
			return s.charAt(0) + smallOutput;
	}
	
	public static void main(String[] args) {
		String s = "mohanrajan";
		System.out.println(replaceChar(s, 'a', 'i'));
		
	}

}
