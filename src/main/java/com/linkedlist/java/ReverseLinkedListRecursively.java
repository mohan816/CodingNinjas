package com.linkedlist.java;

public class ReverseLinkedListRecursively {
	
	/*
	 * 1) Base condition: If the head is null or head.next == null which means one node or zero node in the linked list, jsut return it.
	 * 2) Induction Hypothesis: Just call the function for all the remaining nodes.
	 * 3) In the induction step, iterate the smallOutput, until the smallOutput.next == null, once it's null,
	 *    assign head.next = null then assign smallOutput.next = head.
	 */
	
	public static LinkedListNode<Integer> reverseLinkedListRecursively(LinkedListNode<Integer> head){
		       if(head == null || head.next == null)
		    	      return head;
		       LinkedListNode<Integer> smallOutput = reverseLinkedListRecursively(head.next);
		       LinkedListNode<Integer> tail = smallOutput;
		       while(tail.next != null)
		    	      tail = tail.next;
		       head.next = null;
		       tail.next = head;
		       return smallOutput;
	}

	public static void main(String[] args) {
		//System.out.println("Nohan");
		LinkedListNode<Integer> head = CreateAndPrintLinkedList.createLinkedList();
		head = reverseLinkedListRecursively(head);
		CreateAndPrintLinkedList.printLinkedList(head);
	}
}
