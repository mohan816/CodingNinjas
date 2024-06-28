package com.binarytree.java;

public class SumOfAllNodes {
	
	/*
	 * 1) We have to write the base condition, if the root is null then return 0.Because it's the empty tree
	 * 2) Call recursion for the left subtree and right subtree
	 * 3) return the sum of root data, left sub tree and right sub tree
	 */
	
	
	public static int sumOfNodes(BinaryTree<Integer> root) {
		if(root == null)
			return 0;
		int leftCount = sumOfNodes(root.left);
		int rightCount = sumOfNodes(root.right);
		return root.data + leftCount + rightCount;
	}

	public static void main(String[] args) {
		BinaryTree<Integer> root = BinaryTreeUse.takeInputLevelWise();
		System.out.println("Sum of all Nodes "+sumOfNodes(root));
		
		// TODO Auto-generated method stub

	}

}
