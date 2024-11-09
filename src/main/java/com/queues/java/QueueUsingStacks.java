package com.queues.java;

public class QueueUsingStacks {

	public static void main(String[] args) throws QueueEmptyException {
		// TODO Auto-generated method stub
		ImplementQueueUsingStacks queue = new ImplementQueueUsingStacks();
		for(int i = 1; i < 5; i++)
			queue.enqueue(i);
		System.out.println("Size of the queue "+queue.size());
		System.out.println("Front element of the queue "+queue.front());
		System.out.println("Remove the first element of the queue "+queue.dequeue());
		System.out.println("Front element of the queue "+queue.front());
		System.out.println("Size of the queue "+queue.size());
	}

}
