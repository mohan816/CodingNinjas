package com.queues.java;

public class ImplementQueueUsingArrays {

	/*
	 * The agenda is we are going to create an array and the implement the functions of queue using arrays.
	 */

	private int[] data;
	private int front;
	private int rear;
	private int size;

	public ImplementQueueUsingArrays(int capacity) {
		data = new int[capacity];
		front = -1;
		rear = -1;
	}
	
	//It will return the size of the queue
	public int size() {
		return size;
	}
	
	//It will return true if the queue is empty
	public boolean isEmpty() {
		return size == 0;
	}
	
	//front, but in Queue interface peek() is the function which returns the first element of the queue
	public int front() throws QueueEmptyException {
		if(front == -1)
			throw new QueueEmptyException();
		return data[front];
	}
	
	//In Queue, the name of this function is poll(), which removes the first element of the queue and if the queue is empty it will return null.
	/*
	 * The reason for using front = (front + 1) % data.length; is if the front pointing the last index position and some values are available
	 * in front of the array then front has to point the available value. It is the concept of Circular Queue.
	 */
	public int dequeue() throws QueueEmptyException {
		if(size == 0) {
			throw new QueueEmptyException();
		}
		int frontElement = data[front];
		front = (front + 1) % data.length;
		size--;
		if(size == 0) {
			front = -1;
			rear = -1;
		}
		return frontElement;
	}
	
	//In queue, the name of this function is offer(), it will insert an element to the queue.
	/*
	 * If the rear points the last index position and we inserted the value, to insert a new value we ultimately double it's size and insert
	 * instead of doing this we have to check some spaces are there in front the array, If it's there then we have to start insert from 0th index
	 * position. We are following Circular Queue concept here.
	 */
	public void enqueue(int ele) {
		if(size == data.length)
			doubleCapacity();
		if(size == 0)
			front++;
		  rear = (rear + 1) % data.length;
			data[rear] = ele;
			size++;
	}
	
	//If the data array is filled, then we have to double it's size in order to insert a new element.
	/*
	 * Here the cache is if the front is on index 3, and the rear is on index 0, then the way usually we insert an element wont work
	 * for that we have to start the interation from front to temp.length and then from rear to front - 1. 
	 * So that we can maintain the front and rear indexes correctly and also the insertion will happen the way we expected.
	 */
	private void doubleCapacity() {
	   int[] temp = data;
	   data = new int[2 * temp.length];
	   int index = 0;
	   for(int i = front; i < temp.length; i++)
		   data[index++] = temp[i];
	   for(int i = 0; i < front - 1; i++)
		   data[index++] = temp[i];
	   front = 0;
	   rear = temp.length - 1;
	}
	
	public void printQueue() {
		for(int i = 0; i < data.length; i++)
			System.out.print(data[i]+" ");
	}

	
}
