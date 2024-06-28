package com.binarytree.java;

public class PrintNodesAtDepthK {
	
	/*
	 * 1) Base condition, if the root is null then simply return
	 * 2) if the depth is 0, then return it's data
	 * 3) Call the recursion on the left sub tree and right sub tree
	 */
	
	public static void printNodesAtDepthK(BinaryTree<Integer> root, int k) {
		if(root == null)
			return;
		if(k == 0) {
			System.out.println(root.data);
			return;
		}
		printNodesAtDepthK(root.left, k-1);
		printNodesAtDepthK(root.right, k-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree<Integer> root = BinaryTreeUse.takeInputLevelWise();
		printNodesAtDepthK(root, 3);
		

	}

}
