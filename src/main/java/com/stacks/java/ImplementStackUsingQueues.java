package com.stacks.java;
import java.util.*;

/*
 * Implement a Stack Data Structure specifically to store integer data using two Queues. You have to implement it in such a way that the push 
   operation is done in O(1) time and the pop and top operations are done in O(N) time.
 * There should be two data members, both being Queues to store the data internally. You may use the inbuilt Queue.

Implement the following public functions :
1. Constructor:
It initialises the data members as required.
2. push(data) :
This function should take one argument of type integer. It pushes the element into the stack and returns nothing.
3. pop() :
It pops the element from the top of the stack and in turn, returns the element being popped or deleted. In case the stack is empty, it returns -1.
4. top :
It returns the element being kept at the top of the stack. In case the stack is empty, it returns -1.
5. size() :
It returns the size of the stack at any given instance of time.
6. isEmpty() :
It returns a boolean value indicating whether the stack is empty or not
 */

public class ImplementStackUsingQueues {
	
	Queue<Integer> queue1;
	Queue<Integer> queue2;
	
	
	public ImplementStackUsingQueues() {
		queue1 = new LinkedList<>();
		queue2 = new LinkedList<>();
	}
	
	//Time Complexity: O(1)
	public boolean isEmpty() {
		return queue1.size() == 0;
	}
	
	//Time Complexity: O(1)
	public int size() {
		return queue1.size();
	}
	
	//Time Complexity: O(1)
	public void push(int ele) {
		queue1.offer(ele);
	}
	/*
	 * 1) Idea is queue1 is the main and queue2 is the helper to achieve our needs.
	 * 2) To perform pop() action in the stack, we have to remove the last element in the queue
	 * 3) So, I just kept if the size of the queue1 is > 1, then simply removing the values in the queue1 and adding it to queue2.
	 * 4) Once queue1 reached the size of 1, then removing it and storing in the variable.
	 * 5) Then, adding all the values from queue2 back to queue1.
	 * 6) Finally returning the value which is stored in the variable.
	 */
	//Time Complexity: O(n)
	public int pop() {
		if(size() == 0)
			return -1;
		while(queue1.size() > 1)
			queue2.offer(queue1.poll());
		int top = queue1.poll();
		while(!queue2.isEmpty())
			queue1.offer(queue2.poll());
		return top;
	}
	/*
	 * 1) Idea is queue1 is the main and queue2 is the helper to achieve our needs.
	 * 2) To perform top() action in the stack, we have to return the last element in the queue
	 * 3) So, I just kept if the size of the queue1 is > 1, then simply removing the values in the queue1 and adding it to queue2.
	 * 4) Once queue1 reached the size of 1, then removing the value and storing in the variable.
	 * 5) Then, adding all the values from queue2 back to queue1. and also adding the stored value back to queue1.
	 * 6) Finally returning the value which is stored in the variable.
	 */
	//Time Complexity: O(n)
	public int top() {
		if(size() == 0)
			return -1;
		while(queue1.size() > 1)
			queue2.offer(queue1.poll());
		int top = queue1.poll();
		while(!queue2.isEmpty())
			queue1.offer(queue2.poll());
		queue1.offer(top);
		return top;
	}

}
