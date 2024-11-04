package com.stacks.java;

import java.util.Stack;

public class ReverseStack {

	
	/*
	 * If the input size is 0 or 1 simply return it.
	 * Here the key is storing the element in the ele variable.
	 * For an example 1 2 3, first two elements from the peek 3 2 are stored in the ele
	 * then making the input empty and putting the value into extra stack 
	 * now input is empty and the extra stack is 1
	 * now push the ele value in input, here the point is it push only one ele that is 2 to the input
	 * and from the extra it push 1 to input, now the value in input is 2 1
	 * then again the calculation step will execute because ele have 3 in it.
	 * Now 1 2 will be stored in extra, then 3 push into input, and next 2 1 will be pushed into the input.
	 * The final values in the input is 3 2 1, recursion plays major role here(calculation steps will be executed based on number of
	 * recursive call of ele variable(here 2 times(3 & 2)
	 */
	  
	  public static void reverseStack(Stack<Integer> input, Stack<Integer> extra) {
		  if(input.size() == 0 || input.size() == 1)
			  return;
		   int ele = input.pop();
		   reverseStack(input, extra);
		   while(!input.isEmpty())
			   extra.push(input.pop());
		   input.push(ele);
		   while(!extra.isEmpty())
			   input.push(extra.pop());
	  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> input = new Stack<>();
		Stack<Integer> extra = new Stack<>();
		  input.push(1);
		  input.push(2);
		  input.push(3);
		  System.out.println(input);
		reverseStack(input, extra);
		System.out.println(input);
		  
		  
	}

}
