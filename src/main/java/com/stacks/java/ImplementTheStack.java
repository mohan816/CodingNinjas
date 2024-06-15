package com.stacks.java;

public class ImplementTheStack<T> {
	
	private NodeClass<T> head, toStoreReference;
	private int size;
	
	public ImplementTheStack() {
	}
	public void push(NodeClass<T> ele) {
		toStoreReference = head;
		head = ele;
		head.next = toStoreReference;
		size = size + 1;
	}
	public T top() {
		return head.data;	
	}
	public T pop() {
		T data1 = head.data;
		head = head.next;
		size = size - 1;
		return data1;
		}
	public int size() {
		return size;
	}
	public boolean isEmpty() {
		return size == 0;
	}
	

}
