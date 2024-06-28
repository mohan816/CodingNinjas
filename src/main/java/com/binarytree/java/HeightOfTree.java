package com.binarytree.java;

public class HeightOfTree {
	/*
	 * 1) write the base condition, if the tree is null return 0.
	 * 2) Call the recursion on the left sub tree and right sub tree to get the depth
	 * 3) Find the largest depth between left and right subtree, then add 1 with it and return the result. We are adding 1 because it
	 * is the depth of root.
	 */
	
	public static int heightOfTree(BinaryTree<Integer> root) {
		if(root == null)
			  return 0;
		int depthOfLeftSubtree = heightOfTree(root.left);
		int depthOfRightSubtree = heightOfTree(root.right);
		return 1 + Math.max(depthOfLeftSubtree, depthOfRightSubtree);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree<Integer> root = BinaryTreeUse.takeInputLevelWise();
		System.out.println("Height of the tree is "+heightOfTree(root));

	}

}
