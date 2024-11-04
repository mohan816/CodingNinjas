package com.priorityqueue.java;

import java.util.ArrayList;

public class MinPriorityQueueImplementation<T> {

	//Creating an array list because once the array list is filled then no need to double it's size manually
	private ArrayList<Element<T>> priorityQueue;

	public MinPriorityQueueImplementation() {
		priorityQueue = new ArrayList<>();
	}

	//Size of the priority queue
	public int size() {
		return priorityQueue.size();
	}

	//checking queue is empty or not
	public boolean isEmpty() {
		return size() == 0;
	}

	//getting min value from index 0, because it's min heap so the root node must be min when compared to other nodes
	public Element<T> getMin() throws EmptyPriorityQueueException {
		if(size() == 0)
			throw new EmptyPriorityQueueException();
		return priorityQueue.get(0);
	}

	/*
	 * 1) We have to insert an element at last
	 * 2) Then we have to check whether the immediate root node is smaller than the inserted element.
	 * 3) If the inserted element is smaller then we have to swap the inserted and parent node.
	 * 4) We have to continue the process till the root node, if any of the immediate parent node
	 *    is smaller then we have to exit from the loop.
	 */
	public void insertMin(T data, int priority) {

		Element<T> element = new Element(data, priority);
		//adding an element at last index
		priorityQueue.add(element);
		//childIndex
		int childIndex = priorityQueue.size() - 1;
		//parentIndex
		int parentIndex = (childIndex - 1)/2;

		while(childIndex > 0) {
			if(priorityQueue.get(parentIndex).priority < priorityQueue.get(childIndex).priority)
				return;
			if(priorityQueue.get(parentIndex).priority > priorityQueue.get(childIndex).priority) {
				Element<T> temp = priorityQueue.get(parentIndex);
				priorityQueue.set(parentIndex, priorityQueue.get(childIndex));
				priorityQueue.set(childIndex, temp);
			}
			childIndex = parentIndex;
			parentIndex = (childIndex - 1)/2;
		}
	}
	/*
	 * 1) At first check the size of the queue, if the queue size is empty then throw an exception
	 * 2) We know that an element at index zero is having the min, so we have to get it and replace with
	 *    the help of the last element.
	 * 3) Then assign the positions of parent index, left child & right child index.
	 * 4) We have iterate the while loop, till the left child index less than size of the queue.
	 * 5) first we have to identify which child is less than parent, it might be left or right
	 *    so we have create an variable called minIndex and assign the lesser index of value after compare with left and right child.
	 * 6) If the minIndex == parentIndex which means no lesser priority in both the childs, so simply return the minElement.
	 * 7) Then swap the values then reassign parent, left and right child indexes.
	 */
	public Element<T> removeMin() throws EmptyPriorityQueueException {
		if(size() == 0)
			throw new EmptyPriorityQueueException();
		Element<T> removeMin = priorityQueue.get(0);
		priorityQueue.set(0, priorityQueue.get(priorityQueue.size() - 1));
		priorityQueue.remove(priorityQueue.size() - 1);
		
		int parentIndex = 0;
		int leftChildIndex = (2 * parentIndex) + 1, rightChildIndex = (2 * parentIndex + 2);
		int minIndex = parentIndex;
		
		while(leftChildIndex < priorityQueue.size()) {
		if(priorityQueue.get(minIndex).priority > priorityQueue.get(leftChildIndex).priority)
			minIndex = leftChildIndex;
		if(rightChildIndex < priorityQueue.size() && priorityQueue.get(minIndex).priority > priorityQueue.get(rightChildIndex).priority)
			minIndex = rightChildIndex;
		if(minIndex == parentIndex)
			return removeMin;
		Element<T> temp = priorityQueue.get(minIndex);
		priorityQueue.set(minIndex, priorityQueue.get(parentIndex));
		priorityQueue.set(parentIndex, temp);
		parentIndex = minIndex;
		leftChildIndex = 2 * parentIndex + 1;
		rightChildIndex = 2 * parentIndex + 2;
	}
		return removeMin;
	}



}
