package com.binarytree.java;

public class PreOrderTraversal {
	
	/*
	 * 1) When comes to pre order traversal it will print data in the root node first then left and right node
	 */
	
	public static void preOrderTraversal(BinaryTree<Integer> root) {
		if(root == null)
			return;
		System.out.print(root.data +" ");
		preOrderTraversal(root.left);
		preOrderTraversal(root.right);
	}
	public static void main(String[] args) {
		BinaryTree<Integer> root = BinaryTreeUse.takeInput(true, 0, false);
		preOrderTraversal(root);
	}

}
