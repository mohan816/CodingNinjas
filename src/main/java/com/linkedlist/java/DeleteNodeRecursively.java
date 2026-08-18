package com.linkedlist.java;

public class DeleteNodeRecursively {
	
	/*
	 * 1) Base condition, if the head is null then simply return the head
	 * 2) Check pos == 0, if it's true then return next element, I mean return head.next
	 * 3) Induction Hypotheis: Call the function recursively untill pos == 0 || head == null
	 * 4) In the induction step, assign head.next = smallOutput and return head.
	 */
	public static LinkedListNode<Integer> deleteNodeRecursively(LinkedListNode<Integer> head, int pos){
		if(head == null)
			 return head;
		if(pos == 0)
			return head.next;
		LinkedListNode<Integer> smallOutput = deleteNodeRecursively(head.next, --pos);
		head.next = smallOutput;
		return head;
		
	}
	
	public static void main(String[] args) {
		LinkedListNode<Integer> head = CreateAndPrintLinkedList.createLinkedList();
		head = deleteNodeRecursively(head, 2);
		CreateAndPrintLinkedList.printLinkedList(head);
	}

}
