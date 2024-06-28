package com.binarytree.java;

public class NumberOfLeafNodes {
	
	/*
	 * 1) Base condition if the root is null return 0.
	 * 2) check if the left of the root is null and right of the root is null then return 1
	 * 3) call recursion on the left sub tree and right sub tree return the count of left and right sub trees
	 */
      public static int numberOfLeafNodes(BinaryTree<Integer> root){
    	  if(root == null)
    		  return 0;
    	  if(root.left == null && root.right == null)
    		     return 1;
    	 return numberOfLeafNodes(root.left) + numberOfLeafNodes(root.right);
      }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree<Integer> root = BinaryTreeUse.takeInputLevelWise();
		System.out.print("Number of Leaf Nodes "+numberOfLeafNodes(root));
	}
}
