package com.stacks.java;

public class ImplementStackUsingLinkedList<T> {
	
	private LinkedListNode<T> head;
	private int size = 0;
	
	//Create a node with the given data and make it as head, so that we can get the peek, and also we can perform pop operation like stack
	public void push(T data) {
		if(head == null) {
		head = new LinkedListNode<>(data);
		}
		else {
			LinkedListNode<T> newNode = new LinkedListNode<>(data);
			newNode.next = head;
			head = newNode;
		}
		size++;
	}
	
	/*
	 * If the head is null, which means no data in the stack
	 * if not null, then simply returns head.data
	 */
	public T peek() throws StackEmptyException {
		if(head == null)
			throw new StackEmptyException();
		return head.data;
	}
	/*
	 * if the head is null, which means the stack is empty
	 * if not null, then get the head data and move the head to head.next
	 * And reduce the size by 1
	 */
	public T pop() throws StackEmptyException {
		if(head == null)
			throw new StackEmptyException();
		T temp = head.data;
		head = head.next;
		size--;
		return temp;
	}
	
	/*
	 * Simply return the size variable and it's tracking number of elements
	 */
	public int size() {
		return size;
	}
	
	/*
	 * Just check the size variable is 0 or not, If it is zero which means stack is empty
	 */
	public boolean isEmpty() {
		return size == 0;
	}
	

}
