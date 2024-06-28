package com.binarytree.java;

public class PostOrderTraversal{
/*
 * 1) Post Order Traversal means we have to print the left node data then right node data and finally root node data
 */
	public static void postOrderTraversal(BinaryTree<Integer> root) {
		if(root == null)
			return;
	    postOrderTraversal(root.left);
	    postOrderTraversal(root.right);
	    System.out.print(root.data+" ");
	}
	
	public static void main(String[] args) {
		BinaryTree<Integer> root = BinaryTreeUse.takeInputLevelWise();
		postOrderTraversal(root);
	}
}
