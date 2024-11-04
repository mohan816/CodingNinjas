package com.priorityqueue.java;

public class TestMinPriorityQueue {

	public static void main(String[] args) throws EmptyPriorityQueueException {
		MinPriorityQueueImplementation<String> min = new MinPriorityQueueImplementation<String>();
		min.insertMin("Mohan", 1);
		min.insertMin("Kishore", 2);
		min.insertMin("Poo", 3);
		min.insertMin("srini", 4);
		//getting min
		System.out.println(min.getMin().value);
		//removing the min and return it.
		System.out.println(min.removeMin().value);
		//now, after removing the old min now getting the new min
		System.out.println(min.getMin().value);
		min.insertMin("Kuchi", 0);
		System.out.println(min.getMin().value);
	}

}
