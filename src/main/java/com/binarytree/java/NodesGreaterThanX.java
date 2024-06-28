package com.binarytree.java;

public class NodesGreaterThanX {
	/*
	 * 1) write the base condition
	 * 2) check if the root data is greater than x if it's true then add it to the count
	 * 3) call the recurison on left and right subtree
	 * 4) return the count with nodes greater than x in the left and right subtree.
	 */
	
	public static int countNodesGreaterThanX(BinaryTree<Integer> root, int x) {
		//Your code goes here
		if(root == null)
		      return 0;
		int count = 0;
		if(root.data > x)
		    count++;
		int leftCount = countNodesGreaterThanX(root.left, x);
		int rightCount = countNodesGreaterThanX(root.right, x);
		return count + leftCount + rightCount;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  BinaryTree<Integer> root = BinaryTreeUse.takeInputLevelWise();
	        System.out.print("Nodes greater than X "+countNodesGreaterThanX(root, 10));
	}

}
