package com.stacks.java;

import java.util.Stack;

public class BalancedParenthesis {
	/*
	 * 1) Edge case, If the String is empty return true, it is balanced.
	 * 2) Even we can check, if the length of the string is odd, if it is odd then return false because in the given String
	 *    it will have only open and closed parenthesis
	 * 3) Push the opened parenthesis in the stack and if the closed parenthesis comes then pop the opened parenthesis in the stack
	 *    before popping it check the stack is empty or not, if it's is empty return false.
	 */
	
	public static boolean balancedParenthesis(String s) {
		Stack<Character> stack = new Stack<Character>();
		if(s.length() % 2 != 0)
			return false;
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == '(')
			stack.push(s.charAt(i));
			else if(!stack.isEmpty())
				  stack.pop();
			else
			return false;
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// (((()))))
		System.out.println(balancedParenthesis(""));

	}

}
