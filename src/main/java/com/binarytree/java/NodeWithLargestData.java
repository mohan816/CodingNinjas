package com.binarytree.java;

public class NodeWithLargestData {
	/*
	 * 1) write the base condition, if the root is null return 0;
	 * 2) Call the recursion on the left sub tree and right subtree
	 * 3) compare the right and left subtree and get the maximum, then comapre with root data and return the maximum.
	 */
	
	//Time Complexity O(n), because we are visiting each node at once
	
	public static int largestNode(BinaryTree<Integer> root)
	{
		if(root == null)
			return 0;
	    int leftLargest = largestNode(root.left);
	    int rightLargest = largestNode(root.right);
	    return Math.max(root.data, Math.max(leftLargest, rightLargest));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        BinaryTree<Integer> root = BinaryTreeUse.takeInputLevelWise();
        System.out.print("Largest Node is "+largestNode(root));
        
	}

}
