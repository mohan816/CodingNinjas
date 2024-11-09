package com.stacks.java;

import java.util.Stack;

public class MinimumBracketsReversal {
	
	
	/*
	 * Given: All the characters in the String are open and closed curly brackets, we have to find minimum brackets reversal in order to
	 *        make all the brackets balanced.
	 *  Pseudocode:
	 *  1) If the stack is not empty and the current char is closed curly bracket and the peek of the Stack is open curly bracket, then pop
	 *     the element.
	 *  2) If not then push the element into the stack.
	 *  
	 *  3) After all the iteration, if the stack is not empty then we have to make it empty to get minimum reversal count
	 *  4) Iterate the while loop till the stack is empty, pop the first ele and second ele in the stack, and if both of
	 *     them are same then increase the count by 1 else increase it by 2.
	 */
	
	public static int minimumBracketsReversal(String s) {
		//Edge case, if the length is not even then it's not possible to balance it
		if(s.length() % 2 != 0)
			return -1;
		Stack<Character> stack = new Stack<Character>();
		for(int i = 0; i < s.length(); i++) {
			if(!stack.isEmpty() && s.charAt(i) == '}' && stack.peek() == '{')
				   stack.pop();
			else
				stack.push(s.charAt(i));
		}
		int minimumReversalCount = 0;
		while(!stack.isEmpty()) {
			if(stack.pop() == stack.pop())
				minimumReversalCount++;
			else
				minimumReversalCount += 2;
		}
		return minimumReversalCount;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(minimumBracketsReversal("}{"));

	}

}
