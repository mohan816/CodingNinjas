package com.queues.java;

public class QueueUsingLinkedList {

	public static void main(String[] args) throws QueueEmptyException {
		// TODO Auto-generated method stub
		ImplementQueueUsingLinkedList<Integer> queue = new ImplementQueueUsingLinkedList<>();
		for(int i = 1; i <= 5; i++)
			queue.enqueue(i);
		System.out.println("Front element is "+queue.front());
		System.out.println("Size of the queue is "+queue.size());
		System.out.println("Is the queue is empty "+queue.isEmpty());
		for(int i = 1; i <= 5; i++)
			System.out.print(queue.dequeue());
		System.out.println("Size of the queue is "+queue.size());
		System.out.println("Is the queue is empty "+queue.isEmpty());
		System.out.println("Front element is "+queue.front());
	}

}
