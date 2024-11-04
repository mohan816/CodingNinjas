package com.stacks.java;

import java.util.Stack;

public class BracketsBalanced {
	
	/*
	 * If the close bracket comes then we have to pop the top most element and check the top most element is the open bracket
	 * If the above point is true, then continue, else return false
	 * Once all the iteration is completed, and check the stack is empty, if it's empty return true, else return false
	 */
	public static boolean isBalanced(String s) {
		Stack<Character> stack = new Stack<>();
		for(int i = 0; i < s.length(); i++) {
				if(stack.isEmpty() || s.charAt(i) == '{' || s.charAt(i) == '(' || s.charAt(i) == '[')
					stack.push(s.charAt(i));
				else if(stack.isEmpty() || s.charAt(i) == ']' && stack.pop() != '[' || s.charAt(i) == '}' &&
						stack.pop() != '{' || s.charAt(i) == ')' && stack.pop() != '(')
					return false;	
			}
		if(!stack.isEmpty())
			return false;
		
		return true;	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          System.out.println(isBalanced("[{(a+b)+c*d}+(c+f)]"));
          System.out.println(isBalanced("{{{}}}}]"));
	}

}
