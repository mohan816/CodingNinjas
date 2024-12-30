package com.linkedlist.java;

public class AssignmentProblems {
	
	//Find a node in LinkedList, if it present return the index. If the data is not there return -1
	/*
	 * Sample input: 3 4 5 2 6 1 9, data to find 5
	 * output -> 2, 5 is present in index 2
	 */
	
	public static int findANode(LinkedListNode<Integer> head, int data) {
		int count = 0;
		while(head != null) {
			if(head.data == data)
				return count;
			count++;
			head = head.next;
		}
		return -1;
	}
	
	/*
	 * You have been given a singly linked list of integers along with an integer 'N'. 
	 * Write a function to append the last 'N' nodes towards the front of the singly linked list and returns the new head to the list.
	 * 1 2 3 4 5 n = 3
	 * output: 3 4 5 1 2
	 */
	
	
	public static LinkedListNode<Integer> appenedLastNNode(LinkedListNode<Integer> head, int n){
		//find the length of linked list
		LinkedListNode<Integer> temp = head;
		int length = 0;
		while(temp != null) {
			temp = temp.next;
			length++;
		}
		//Number of iterations we have to go is length - n;
		int count = 1;
		temp = head;
		LinkedListNode<Integer> nextNodeAddress = null;
		while(count <= length - n) {
			if(count == length - n) {
				nextNodeAddress = temp.next;
				temp.next = null;
				break;
			}
			temp = temp.next;
			count++;
		}
		temp = nextNodeAddress;
		while(temp.next != null) {
			temp = temp.next;
		}
		temp.next = head;
		return nextNodeAddress;
	}
	
	/*
	 * You have been given a singly linked list of integers where the elements are sorted in ascending order.
	 *  Write a function that removes the consecutive duplicate values 
	 * such that the given list only contains unique elements and returns the head to the updated list.
	 * Input: 1 2 3 3 3 3 4 4 4 5 5 7
       Output
              1 2 3 4 5 7
              
        1) If the data of the current node and the next node is equal, then assign temp.next = temp.next.next, so that it
        points the third node from the current node, then we can compare the data, if the data is not equal, then simply
        moves the temp pointer to next node.
	 */
	
	public static LinkedListNode<Integer> eliminateDuplicates(LinkedListNode<Integer> head){
		if(head == null)
			  return null;
		LinkedListNode<Integer> temp = head;
		while(temp.next != null) {
			if(temp.data.equals(temp.next.data))
				temp.next = temp.next.next;
			else
				temp = temp.next;
		}
		return head;
	}
	
	/*
	 * Print linked list in reverse
	 * Input: 1 2 3 4 5
	 * output: 5 4 3 2 1
	 * 
	 * 1) If the head is null or the linked list contains single value, then simply return it.
	 * 2) Create three reference variables, one is to point the first node and other two points the second node of the list.
	 * 3) Iterate the linked list until temp.next != null, if it's null simply point temp.next = prev and return temp.
	 * 4) Before changing the address keep a note of it.
	 */
	
	public static LinkedListNode<Integer> reverseLinkedList(LinkedListNode<Integer> head){
		if(head == null || head.next == null)
			  return head;
		LinkedListNode<Integer> prev = head, next = head.next, temp = head.next;
		while(temp.next != null) {
			next = temp.next;
			temp.next = prev;
			prev = temp;
			temp = next;
		}
		temp.next = prev;
		return temp;
	}
	
	
	

}
