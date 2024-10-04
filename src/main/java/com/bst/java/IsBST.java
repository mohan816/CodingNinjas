package com.bst.java;

import com.binarytree.java.BinaryTree;

public class IsBST {
	
	/*
	 * 1) At first, we have to check whether the root is null or not, if it is null then we have to return true
	 * 2) The whole idea is have to find the max value of left sub tree and the min value of right subtree.
	 * 3) If the max value of the left Subtree is greater than root.data then return false or if the min value of the right subtree is 
	 *    lesser than root.data then also return false.
	 * 4) We have to check the same for each root node of both the sides.
	 */
	//Time complexity worst case O(n^2) best case O(nlogn)
	public static boolean isBST1(BinaryTree<Integer> root) {
		if(root == null)
			return true;
		//getting the max value from the left sub tree
		int leftMax = maximum(root.left);
		if(leftMax > root.data)
			return false;
		//getting the min value from the right sub tree
		int rightMin = minimum(root.right);
		if(rightMin < root.data)
			return false;
		//Have to check for all the root nodes so calling both the left and right sub trees.
		return isBST1(root.left) && isBST1(root.right);
	}
	//finding the max value
	public static int maximum(BinaryTree<Integer> root) {
		if(root == null)
			return Integer.MIN_VALUE;
		int leftMax = maximum(root.left);
		int rightMax = maximum(root.right);
		return Math.max(root.data, Math.max(leftMax, rightMax));
	}
	
	//finding the min value
	public static int minimum(BinaryTree<Integer> root) {
		if(root == null)
			return Integer.MAX_VALUE;
		int leftMin = minimum(root.left);
		int rightMin = minimum(root.right);
		return Math.max(root.data, Math.max(leftMin, rightMin));
	}
	
	//Time complexity of this approach is O(n)
	/*
	 * 1) Base condition is if the root is null then return true
	 * 2) We have to check, root.data is lesser than min or root.data is greater than max return false
	 * 3) We have to call the left sub tree with min as it is and the max must be root.data - 1
	 * 4) We have to call the right sub tree with min as root.data + 1 and the max as it is max.
	 * 5) Finally have to return it.
	 */
	public static boolean isBST2(BinaryTree<Integer> root, int min, int max) {
		if(root == null)
			return true;
		if(root.data < min || root.data > max)
			return false;
		boolean leftSubTree = isBST2(root.left, min, root.data - 1);
		boolean rightSubTree = isBST2(root.right, root.data + 1, max);
		return leftSubTree && rightSubTree;
	}
	
	public static void main(String[] args) {
		BinaryTree<Integer> root = SearchDataInBst.takeInput(true, 4, false);
		System.out.println("The given tree is BST "+isBST1(root));
		
	}

}
