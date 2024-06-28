package com.binarytree.java;

public class PrintNodesWithoutSibling{
	/*
	 * Base Condition -> if root is null then simply return
	 * 1) Check if the right child of the root is null, then return root's left data
	 * 2) check if the left child of the root is null, then return root's right data
	 */
	
	public static void printNodesWithoutSibling(BinaryTree<Integer> root) {
		//Your code goes here
		if(root == null)
		     return;
		if(root.left != null  &&  root.right == null)
		     System.out.print(root.left.data+" ");
		 if(root.left == null &&  root.right != null)
		     System.out.print(root.right.data+" ");
		printNodesWithoutSibling(root.left);
		printNodesWithoutSibling(root.right);
	}
	public static void main(String[] args) {
		BinaryTree<Integer> root = BinaryTreeUse.takeInputLevelWise();
		printNodesWithoutSibling(root);
	}

}
