package com.linkedlist.java;

public class InsertNodeAtGivenPosition {
	
	/*
	 * 1) If the position is zero and we have to add data, then simply create the node and add head address to the next of the node and return node.
	 * 2) Else, then create a variable count and assign 0 to it. The idea is if count - 1 == pos , which means there we have to save the
	 *    address of the next node address and create a new node with the data. Then connect new node to the next of the current 
	 *    node and connect the save address to the next of the new node.
	 *    
	 *    Note: Position starts with 0.
	 */
	
	public static LinkedListNode<Integer> insertNodeAtGivenPosition(LinkedListNode<Integer> head, int pos, int data){
		    if(pos == 0) {
		    	LinkedListNode<Integer> node = new LinkedListNode<Integer>(data);
		    	node.next = head;
		    	return node;
		    }
		    int count = 0;
		    LinkedListNode<Integer> temp = head;
		    LinkedListNode<Integer> nextNodeAddress = null;
		    while(temp != null) {
		    	if(count + 1 == pos) {
		    		nextNodeAddress = temp.next;
		    		LinkedListNode<Integer> node = new LinkedListNode<Integer>(data);
		    		node.next = nextNodeAddress;
		    		temp.next = node;
		    		break;
		    	}
		    	count++;
		    	temp = temp.next;
		    }
		    return head;
	}
	
	public static void main(String[] args) {
		LinkedListNode<Integer> head = CreateAndPrintLinkedList.createLinkedList();
		head = insertNodeAtGivenPosition(head, 5, 10);
		CreateAndPrintLinkedList.printLinkedList(head);
	}

}
