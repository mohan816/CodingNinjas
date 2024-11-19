package com.queues.java;
import java.util.*;

/*
 * You have been given a queue that can store integers as the data. 
 * You are required to write a function that reverses the populated queue itself without using any other data structures.
 * input: 1 2 3 4 5
 * output: 5 4 3 2 1
 */

public class ReverseQueue {
	/*
	 * 1) If the input is empty, then return it
	 * 2) Poll the input's element and do the recursive call and continue it till the input's size become's zero
	 * 3) finally, add the element to the input
	 */
	public static void reverseQueue(Queue<Integer> input) {
		if(input.isEmpty())
			return;
		int ele = input.poll();
		reverseQueue(input);
		input.offer(ele);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Queue<Integer> input = new LinkedList<>();
     for(int i = 1; i <= 5; i++)
    	 input.offer(i);
     reverseQueue(input);
    Object[] arr = input.toArray();
     for(int i = 0; i < arr.length; i++)
    	 System.out.print(arr[i]+" ");
	}

}
