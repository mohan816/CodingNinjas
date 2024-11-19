package com.queues.java;

import java.util.*;

/*
 * For a given queue containing all integer data, reverse the first K elements.
   You have been required to make the desired change in the input queue itself.
   
   input: 10 20 30 40 50 60 70 80 90, k = 4
   output: 40 30 20 10 50 60 70 80 90
 */
public class ReverseFirstKElements {
	/*
	 * 1) Create a new method to reverse first k elements, use poll() and store it in ele variable
	 *    do the recursive call till k become zero or lesser than zero
	 * 2) then simply add the value to the queue.
	 * 3) then use for or while loop, iterate the loop till input.size() - k
	 * 4) In the each iteration poll the first element of the queue and add it to the last in the queue.
	 * 5) Finally return the queue.
	 */
	public static Queue<Integer> reverseFirstKElements(Queue<Integer> input, int k){
		if(k <= 0 || k > input.size() || input.isEmpty())
			return input;
		reverseKElements(input, k);
		for(int i = 0; i < input.size() - k; i++)
			input.offer(input.poll());
		return input;
		
	}
	
	public static void reverseKElements(Queue<Integer> input, int k) {
		if(k == 0)
			return;
	    int ele = input.poll();
	    k--;
	    reverseKElements(input, k);
	    input.offer(ele);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
