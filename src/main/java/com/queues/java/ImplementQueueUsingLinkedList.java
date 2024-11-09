package com.queues.java;

public class ImplementQueueUsingLinkedList<T>{
	
	LinkedListNode<T> head;
	LinkedListNode<T> tail;
	int size;
	
	//To return the size of the queue
	public int size() {
		return size;
	}
	
	//It return true if the queue is empty else it will return false
	public boolean isEmpty() {
		return size == 0;
	}
	
	//It will return the front element of the queue
	public T front() throws QueueEmptyException {
		if(size == 0)
			throw new QueueEmptyException();
		return head.data;
	}
	
	/*
	 * To insert a new element in the queue
	 */
	public void enqueue(T ele) {
		LinkedListNode<T> newNode = new LinkedListNode<>(ele);
		if(size == 0) {
			head = newNode;
			tail = newNode;
		}
		else {
			tail.next = newNode;
			tail = newNode;
		}
		size++;
	}
	
	/*
	 * To remove the front element from the queue
	 */
	public T dequeue() throws QueueEmptyException {
		if(size == 0)
			throw new QueueEmptyException();
		T temp = head.data;
		head = head.next;
		size--;
		return temp;
	}

}
