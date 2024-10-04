package com.bst.java;

import com.binarytree.java.BinaryTree;

public class ElementsInRangeK1K2 {
	/*
	 * 1) Problem statement is have to print the data within range of K1 and K2 and both are inclusive
	 * 2) We have to print the data from the increasing order
	 */
	
	public static void printElementsInRangeK1K2(BinaryTree<Integer> root, int k1, int k2) {
		if(root == null)
			return;
		printElementsInRangeK1K2(root.left, k1, k2);
		if(root.data >= k1 && root.data <= k2)
			 System.out.print(root.data+" ");
		printElementsInRangeK1K2(root.right, k1, k2);
		
	}
	
	public static void main(String[] args) {
	BinaryTree<Integer> node = 	SearchDataInBst.takeInput(true, 10, false);
	printElementsInRangeK1K2(node, 5, 10);
		
	}

}
