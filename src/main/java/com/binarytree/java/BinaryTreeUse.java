package com.binarytree.java;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BinaryTreeUse{
	
	public static void printTreeLevelWise(BinaryTree<Integer> root) {
		if(root == null) {
			System.out.print("Tree is empty");
			return;
		}
		Queue<BinaryTree<Integer>> nodesInQueue = new LinkedList<BinaryTree<Integer>>();
		nodesInQueue.offer(root);
		while(!nodesInQueue.isEmpty()) {
			BinaryTree<Integer> front = nodesInQueue.poll();
			System.out.print(front.data+" : ");
			if(front.left != null) {
				System.out.print("L"+front.left.data+ " ");
				nodesInQueue.offer(front.left);
			}
			if(front.right != null) {
				System.out.print("R"+front.right.data+ " ");
				nodesInQueue.offer(front.right);
			}
			System.out.println();
		}
	}

	public static BinaryTree<Integer> takeInputLevelWise(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the root data");
		int rootData = sc.nextInt();
		if(rootData == -1)
			return null;
		Queue<BinaryTree<Integer>> pendingChildren = new LinkedList<BinaryTree<Integer>>();
		BinaryTree<Integer> rootNode = new BinaryTree<Integer>(rootData);
		pendingChildren.add(rootNode);

		while(!pendingChildren.isEmpty()) {
			BinaryTree<Integer> front = pendingChildren.poll();
			System.out.println("Enter the left node data of "+front.data);
			int leftNodeData = sc.nextInt();
			if(leftNodeData != -1) {
				BinaryTree<Integer> nodeLeft = new BinaryTree<Integer>(leftNodeData);
				front.left = nodeLeft;
				pendingChildren.add(nodeLeft);
			}
			System.out.println("Enter the right node data of "+front.data);
			int rightNodeData = sc.nextInt();
			if(rightNodeData != -1) {
				BinaryTree<Integer> nodeRight = new BinaryTree<Integer>(rightNodeData);
				front.right = nodeRight;
				pendingChildren.add(nodeRight);
			}
		}
           return rootNode;
	}


	public static BinaryTree<Integer> takeInput(boolean root, int data, boolean left) {
		if(root)
			System.out.println("Enter the root data");
		else
			if(left)
				System.out.println("Enter the left of "+data);
			else
				System.out.println("Enter the right of "+data);
		Scanner sc = new Scanner(System.in);
		int rootData = sc.nextInt();
		if(rootData == -1)
			return null;
		BinaryTree<Integer> node = new BinaryTree<Integer>(rootData);
		BinaryTree<Integer> leftNode = takeInput(false,rootData, true);
		BinaryTree<Integer> rightNode = takeInput(false, rootData, false);
		node.left = leftNode;
		node.right = rightNode;
		return node;	
	}

	public static void print(BinaryTree<Integer> root){
		if(root == null)
			return;
		System.out.print(root.data+" : ");
		if(root.left != null)
			System.out.print(" L"+root.left.data);
		if(root.right != null)
			System.out.print(" R"+root.right.data);
		System.out.println();
		print(root.left);
		print(root.right);
	}
	public static int countNodes(BinaryTree<Integer> root) {
		if(root == null)
			return 0;
		//Below commented code is working fine
		//		int count = 0;
		//		if(root != null)
		//			count++;
		//		count += countNodes(root.left);
		//		count += countNodes(root.right);
		int leftCount = countNodes(root.left);
		int rightCount = countNodes(root.right);
		return 1 + leftCount + rightCount;
	}
	
	public static int getSum(BinaryTree<Integer> root) {
		//Your code goes here.
		if(root == null)
		     return 0;
		int count = 0;
		if(root != null)
		    count += root.data;
		int leftCount = getSum(root.left);
		int rightCount = getSum(root.right);
		return count + leftCount + rightCount;
	}

	public static void main(String[] args) {
		BinaryTree<Integer> root = takeInput(true, 0, false);
		System.out.println(getSum(root));
//		BinaryTree<Integer> root = takeInputLevelWise();
//		printTreeLevelWise(root);
//		System.out.println("Number of nodes "+ countNodes(root));
//	}
	}

}
