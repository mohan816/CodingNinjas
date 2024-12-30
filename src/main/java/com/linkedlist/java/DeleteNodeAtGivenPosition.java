package com.linkedlist.java;

public class DeleteNodeAtGivenPosition {
	
	/*
	 * 1) If the pos is 0, then simply return head.next
	 * 2) Simply create a count and initialize with 0, then check the condition temp.next != null, because if the position is 
	 *    equal to the length of the linked list and if we didn't use temp.next != null, then we will get null pointer exception.
	 * 3) if count + 1 == pos, which means we have to delete the temp.next node, so simply store the address of the temp.next.next into
	 *    the variable then assign it to temp.next, then break the loop and return the head.
	 */
	
	public static LinkedListNode<Integer> deleteNodeAtGivenPosition(LinkedListNode<Integer> head, int pos){
		if(pos == 0)
			return head.next;
		int count = 0;
		LinkedListNode<Integer> temp = head;
		while(temp.next != null) {
			if(count + 1 == pos) {
				temp.next = temp.next.next;
				break;
			}
			count++;
			temp = temp.next;
		}
		return head;
	}
	
	public static void main(String[] args) {
		LinkedListNode<Integer> head = CreateAndPrintLinkedList.createLinkedList();
		head = deleteNodeAtGivenPosition(head, 5);
		CreateAndPrintLinkedList.printLinkedList(head);
	}

}
