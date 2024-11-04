package com.stacks.java;

import java.util.Stack;

public class CheckRedundantBrackets {
	
	/*
	 * Problem Statement: 
	 * For a given expression in the form of a string, find if there exist any redundant brackets or not. 
	 * It is given that the expression contains only rounded brackets or parenthesis and the input expression will always be balanced.
	 * A pair of the bracket is said to be redundant when a sub-expression is surrounded by unnecessary or needless brackets
	 * 
	 * 1) Push all the characters to the stack except the closed parenthesis.
	 * 2) Once the closed parenthesis comes, then check the peek of the stack have open parenthesis, if it have open then
	 * return true because it have redundant brackets.
	 * 3) if not, pop all the characters in the stack till it found the open parenthesis.
	 */
	
	public static boolean checkRedundantBrackets(String s) {
		//edge case
		//If the length is <=3, it means we can say it is having redundant brackets.
		if(s.length() <= 3)
			return true;
		Stack<Character> stack = new Stack<Character>();
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) != ')')
				stack.push(s.charAt(i));
			else {
				if(stack.peek() == '(')
					return true;
				while(!stack.isEmpty()) {
					if(stack.peek() == '(') {
						stack.pop();
						break;
					}
						stack.pop();
					
				}
			}
		}
		return false;
	}
	
	
	public static void main(String[] args) {
		
	}

}
