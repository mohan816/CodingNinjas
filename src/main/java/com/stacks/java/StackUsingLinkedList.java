package com.stacks.java;

public class StackUsingLinkedList {

	public static void main(String[] args) throws StackEmptyException {
		// TODO Auto-generated method stub
		
		ImplementStackUsingLinkedList<Object> stack = new ImplementStackUsingLinkedList<>();
		stack.push("Mohan");
		stack.push(28);
		stack.push("black");
		System.out.println(stack.size());
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.size());
		System.out.println(stack.isEmpty());
		stack.push("Mohan");
		System.out.println(stack.size());
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		
		
		
		
		

	}

}
