package com.arrays.java;

import java.util.Stack;

public class BalencedParenthesis {

	/*
	 * 1) Using replaceALl method I will remove the alphabets
	 * 2) Stack<Character> s = new Stack<>();
	 * 3) 
	 * 4) s.charAt(0) == ')' || s.charAt(0) = '}' || s.charAt(0) = ']', return false, it won't be the valid one
	 * 5) Iterate the string from 0th index to length()-1
	 * 6) if the stack is empty and the parenthesis is the open open then i will push that one to the stack.
	 * 7) If the stack is empty and the parenthesis is the closed one then i will return false, 
	 * 8) 
	 */

	public static boolean isBalancedParenthesis(String a) {
		String s = a.replaceAll("[a-zA-Z0-9]","");
		System.out.println(s);
		Stack<Character> stack = new Stack<>();
		if(s.charAt(0) == ')' || s.charAt(0) == '}' || s.charAt(0) == ']')
			return false;
		for(int i = 0; i < s.length(); i++) {
			
		  if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
					stack.push(s.charAt(i));
			}
			else if(!stack.isEmpty() && s.charAt(i) == ']') {
				if(stack.pop() == '[')
					continue;
				else
					return false;

			}
			else if(!stack.isEmpty() && s.charAt(i) == ')') {
				if(stack.pop() == '(')
					continue;
				else
					return false;

			}
			else if(!stack.isEmpty() && s.charAt(i) == '}') {
				if(stack.pop() == '{')
					continue;
				else
					return false;
			}
		}
		  if(stack.isEmpty())
			  return true;
		  else
			  return false;
             

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isBalancedParenthesis("test)([]){{{}}}"));
		//test([]){{{}}"

	}

}
