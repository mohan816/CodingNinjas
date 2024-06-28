package com.binarytree.java;

public class InOrderTraversal {
	/*
	 * 1) We have to print the left sub tree first then the root node then the right sub tree
	 * 2) if the root is null then simply return it
	 * 3) else, checking the root is having the left sub tree, if it's having then call the recursion on the left 
	 * sub tree and print the data.
	 * 4) then call the recursion on the right sub tree and print the data.
	 */
	
	public static void inOrderTraversal(BinaryTree<Integer> root) {
		if(root == null)
			return;
		if(root.left != null) {
		inOrderTraversal(root.left);
		}
		System.out.print(root.data + " ");
		if(root.right != null) {
		inOrderTraversal(root.right);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         BinaryTree<Integer> root = BinaryTreeUse.takeInputLevelWise();
         inOrderTraversal(root);
	}

}
