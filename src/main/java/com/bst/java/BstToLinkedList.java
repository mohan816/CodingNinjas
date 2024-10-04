package com.bst.java;

import com.binarytree.java.BinaryTree;

public class BstToLinkedList {

	public static LinkedListNode<Integer> convertBstToLinkedList(BinaryTree<Integer> root){
		if(root == null)
			return null;
		LinkedListNode<Integer> head = new LinkedListNode<Integer>(root.data);
		helper(root, head);
		return head.next;
	}
	
	public static LinkedListNode<Integer> helper(BinaryTree<Integer> binarySearchNode, LinkedListNode<Integer> currentLL){
		if(binarySearchNode == null)
			return null;
		if(binarySearchNode.left != null) {
			currentLL = helper(binarySearchNode.left, currentLL);
		}
		
		if(binarySearchNode.right != null) {
			currentLL = helper(binarySearchNode.right, currentLL);
		}
		return currentLL;
		
	}
	
	public static LinkedListNode<Integer> add(BinaryTree<Integer> binarySearchNode, LinkedListNode<Integer> currentLL){
		LinkedListNode<Integer> newNode = new LinkedListNode<Integer>(binarySearchNode.data);
		currentLL.next = newNode;
		return newNode;
		
	}

}
