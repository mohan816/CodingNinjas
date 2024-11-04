package com.stacks.java;

//Create this class to have a node with data and next to point another node.
public class LinkedListNode<T> {
	
	T data;
	LinkedListNode<T> next;
	
	public LinkedListNode(T data) {
		this.data = data;
	}

}
