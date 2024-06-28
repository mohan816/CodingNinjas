package com.binarytree.java;

public class IsNodePresent {
	/*
	 * Base Condition -> If the root is null return false
	 * 1) check if the root data is equal to x ,then return true
	 * 2) Call the recursion on left sub tree and right sub tree
	 * 3) if the x is present in left or right sub tree then return true else return false.
	 */
	
	public static boolean isNodePresent(BinaryTree<Integer> root, int x) {
	    //Your code goes here
		if(root == null)
		     return false;
		if(root.data == x)
		     return true;
		boolean leftNode =  isNodePresent(root.left, x);
		boolean rightNode =  isNodePresent(root.right, x);
		if(leftNode || rightNode)
		    return true;
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        BinaryTree<Integer> root = BinaryTreeUse.takeInputLevelWise();
        System.out.println(isNodePresent(root, 10));
	}

}
