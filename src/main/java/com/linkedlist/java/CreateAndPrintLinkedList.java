package com.linkedlist.java;

import java.util.Scanner;

/*
 * 1) Create linked List of size n, and print the values of each node in the linked list.
 */

public class CreateAndPrintLinkedList {
	
	/*
	 * 1) Take the size of the linked list from the user
	 * 2) Create two variables head and tail, if head is null which means going to create the first node
	 * 3) We always have to keep the reference of head, so that it;s possible to iterate the linked list until the last node.
	 * 4) So create two variables head and tail, head is to store the reference of first node and tail is used to link the nodes
	 */
	public static LinkedListNode<Integer> createLinkedList(){
		System.out.println("Enter the size of the linked list");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		LinkedListNode<Integer> head = null;
		LinkedListNode<Integer> tail = null;
		int size = 1;
		while(n > 0) {
			if(head == null) {
				System.out.print("Enter the value of node "+size++);
				LinkedListNode<Integer> node = new LinkedListNode<Integer>(sc.nextInt());
				head = node;
				tail = node;
			}
			else {
				System.out.print("Enter the value of node "+size++);
				LinkedListNode<Integer> node = new LinkedListNode<Integer>(sc.nextInt());
				tail.next = node;
				tail = tail.next;
			}
			n--;
		}
		  return head;
	}
	
	/*
	 * Increment Every Node by 1
	 * simply increase the data of each node by 1, continue till head becomes zero.
	 */
	  public static void incrementEveryNodeBy1(LinkedListNode<Integer> head) {
		  while(head != null) {
			  head.data++;
			  head = head.next;
		  }
	  }
	/*
	 * Iterate the head until it becomes null and in each iteration print the data
	 */
	public static void printLinkedList(LinkedListNode<Integer> head) {
		while(head != null) {
			System.out.print(head.data+" ");
			head = head.next;
		}
	}
	
	/*
	 * Check head is null or not, if not null increment the length by 1, and points the head to the next node.
	 */
	public static void lengthOfLinkedList(LinkedListNode<Integer> head) {
		int length = 0;
		while(head != null) {
			length++;
			head = head.next;
		}
		System.out.println("Length of the linked list is "+length);
	}
	
	public static void main(String[] args) {
		LinkedListNode<Integer> head = createLinkedList();
		incrementEveryNodeBy1(head);
		lengthOfLinkedList(head);
		printLinkedList(head);
	}

}
