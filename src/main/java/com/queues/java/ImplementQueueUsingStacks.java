package com.queues.java;

import java.util.Stack;

/*
 * Intention is going to use two stacks to implement queue functions.
 * Going to use Stack1 as the main object and stack2 as helper.
 * To get the size of the queue, just return stack1.size();
 * To check the queue.isEmpty(), just return stack1.isEmpty() or stack1.size() == 0
 * To insert an element in the queue, just push it to stack1
 * To see the front element, push all the element except the last element to stack2, and store the last element stack1 to front variable
 * and then push all the elements of stack2 back to stack1.
 * And we have to follow the same above operation for dequeue.
 */
public class ImplementQueueUsingStacks{
	
	Stack<Integer> stack1 = new Stack<>();
	Stack<Integer> stack2 = new Stack<>();
	
	public int size() {
		return stack1.size();
	}
	
	public boolean isEmpty() {
		return stack1.size() == 0;
	}
	
	public void enqueue(int ele) {
		stack1.push(ele);
	}
	
	public int front() throws QueueEmptyException {
		if(stack1.size() == 0)
			throw new QueueEmptyException();
		while(stack1.size() != 1)
			stack2.push(stack1.pop());
		int frontElement = stack1.peek();
		while(!stack2.isEmpty())
			stack1.push(stack2.pop());
		return frontElement;
	}
	
	public int dequeue() throws QueueEmptyException {
		if(stack1.size() == 0)
			throw new QueueEmptyException();
		while(stack1.size() != 1)
			stack2.push(stack1.pop());
		int ele = stack1.pop();
		while(!stack2.isEmpty())
			stack1.push(stack2.pop());
		return ele;
	}

}
