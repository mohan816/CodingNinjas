package com.stacks.java;

public class StackUsingArrays {

	public static void main(String[] args) throws StackEmptyException {
		// TODO Auto-generated method stub
		
		ImplementStackUsingArrays stack = new ImplementStackUsingArrays(5);
		//System.out.println("The peek element of the stack is "+stack.peek());
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		System.out.println("The size of stack is "+stack.size());
		stack.push(6);
		stack.push(7);
		System.out.println("The size of stack is "+stack.size());
		System.out.println("The peek element of the stack is "+stack.peek());
		System.out.println("Removing top most element of the stack "+stack.pop());
		System.out.println("Removing top most element of the stack "+stack.pop());
		System.out.println("Removing top most element of the stack "+stack.pop());
		System.out.println("Removing top most element of the stack "+stack.pop());
		System.out.println("The size of stack is "+stack.size());
		System.out.println("The peek element of the stack is "+stack.peek());
		System.out.println("Checking stack is empty or not "+stack.isEmpty());
		
	}

}
