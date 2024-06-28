package com.binarytree.java;

public class ReplaceNodeWithDepth{
	/*
	 * Base Condition -> if the root is null, then return
	 * assign level value to the root's data, then increase the level by 1
	 * 
	 */
	
	public static void changeToDepthTree(BinaryTree<Integer> root) {
	    //Your code goes here
		changeToDepthTree(root, 0);
	
	}
	public static void changeToDepthTree(BinaryTree<Integer> root, int level){
               if(root == null)
			       return;
				root.data = level;
			changeToDepthTree(root.left, level + 1);
			changeToDepthTree(root.right, level + 1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree<Integer> root = BinaryTreeUse.takeInputLevelWise();
		changeToDepthTree(root);
		BinaryTreeUse.printTreeLevelWise(root);
	}

}
