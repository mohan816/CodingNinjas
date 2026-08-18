package com.recursion.coding;

import java.util.Arrays;

public class SubsequencesOfString {
  
	//the formula for calculating  sub sequence is 2^input.length()
	
	/*  Idea:
	 *   We know that the sub sequence of given String is 2^String.length()
	 *   What we have to do just append s.charAt(0) with the smallOutput, it's the induction step
	 *   Induction hypothesis will take care of remaining characters of the String
	 * 
	 */
	
	/*Pseudocode 
	 * Example String = "abc";
	 * Here the idea is if the String is empty, then we have to return the empty String[] array.
	 * So the base case is if the String is empty then return empty String array
	 * In the induction hypothesis, send the argument as String.substring(1);
	 * And in the induction step, the size of the output is 2 * smallOutput.length
	 * Just concatenate the char String.charAt(0) with each Index of smallOutput array
	 */
	
	public static String[] subSequence(String input) {
		if(input.length() == 0)
			return new String[] {""};
		String[] smallOutput = subSequence(input.substring(1));
		String[] output = new String[smallOutput.length * 2];
		int j = 0;
		for(int i = 0; i < smallOutput.length; i++) {
			output[j] = smallOutput[i];
			output[j + 1] = input.charAt(0) + smallOutput[i];
			j += 2;
		}
		return output;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.print(Arrays.asList(subSequence("abc")));
	}

}
