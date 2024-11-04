package com.priorityqueue.java;

/*
 * 1) We are creating this class because in priority queue each node must have value and the priority associated with it.
 */
public class Element<T> {
	
	T value;
	int priority;
	
	public Element(T value, int priority) {
		this.value = value;
		this.priority = priority;
	}

}
