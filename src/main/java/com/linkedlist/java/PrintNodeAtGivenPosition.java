package com.linkedlist.java;

public class PrintNodeAtGivenPosition {
	
	/*
	 * 1) Create a variable count and assign the value to 1, check count and position are equal, 
	 * if equal then print the data and stops the execution.
	 * 2) Else increment the count by 1 and points head to the next node.
	 */
	
	public static void printNode(LinkedListNode<Integer> head, int pos) {
		int count = 1;
		while(head != null) {
			if(count == pos) {
				System.out.print(head.data);
				return;
			}
			count++;
			head = head.next;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
