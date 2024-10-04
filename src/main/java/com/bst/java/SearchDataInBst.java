package com.bst.java;

import java.util.Scanner;

import com.binarytree.java.BinaryTree;

public class SearchDataInBst {
	
	public static boolean searchDataInBst(BinaryTree<Integer> root, int x) {
		if(root == null)
		return false;
		if(root.data == x)
			return true;
		//If the root data is greater than the search element it means if the data present in the tree then it must be present in the left sub tree
		if(root.data > x)
			return searchDataInBst(root.left, x);
		else
			return searchDataInBst(root.right, x);
	}
	
	public static BinaryTree<Integer> takeInput(boolean root, int data, boolean left){
		if(root) {
			System.out.println("Enter the root data");
		}
		else {
			if(left)
				System.out.println("Enter the root left "+data);
			else
				System.out.println("Enter the root right "+data);
		}
		Scanner sc = new Scanner(System.in);
		int rootData = sc.nextInt();
		if(rootData == -1)
			return null;
		BinaryTree<Integer> node = new BinaryTree<Integer>(rootData);
		BinaryTree<Integer> leftNode = takeInput(false, rootData, true);
		BinaryTree<Integer> rightNode = takeInput(false, rootData, false);
		node.left = leftNode;
		node.right = rightNode;
		return node;
		
	}
	
	public static void main(String[] args) {
		BinaryTree<Integer> root = takeInput(true, 10, false);
		System.out.println(searchDataInBst(root, 5));
	}

}
