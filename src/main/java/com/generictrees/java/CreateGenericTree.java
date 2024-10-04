package com.generictrees.java;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class CreateGenericTree {
     /*
      * 1) Idea is first create the root node, then ask is size
      * 2) Once you know the size, then enter into the loop and execute the loop till the size becomes 0.
      * 3) Inside the loop create it's child node and add it to the root node.
      * 4) Then finally return the root.
      */
	public static GenericTree<Integer> createGenericTree(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the root data");
		int data = sc.nextInt();
		if(data == -1)
			return null;
		GenericTree<Integer> root = new GenericTree<Integer>(data);
		System.out.println("Enter the size of the node "+root.data);
		int nodeSize = sc.nextInt();
		while(nodeSize > 0) {
			GenericTree<Integer> child = createGenericTree();
			root.children.add(child);
			nodeSize--;
		}
		return root;
	}
	
	/*
	 * 1) First print the root data, then iterate the loop till it's size and call the
	 *    recursion and print the data
	 */
	public static void printGenericTree(GenericTree<Integer> root) {
		if(root == null)
			return;
		System.out.println(root.data);
		for(int i = 0; i < root.children.size(); i++) {
			printGenericTree(root.children.get(i));
		}
	}
	/*
	 * 1) Create a queue, and add the root to it.
	 * 2) Before entering into the loop print it's data
	 * 3) Exit the while loop once the queue is empty.
	 * 4) We have to print the data in level wise, so take the queue size first and create
          while loop and execute the while loop till the size becomes zero, so that we can print the data in level wise
	 */
	public static void printTreeLevelwise(GenericTree<Integer> root) {
		if(root == null)
			return;
		Queue<GenericTree<Integer>> queue = new LinkedList<GenericTree<Integer>>();
		queue.offer(root);
		System.out.println(root.data);
		while(!queue.isEmpty()) {
			int size = queue.size();
			while(size > 0) {
			GenericTree<Integer> front = queue.poll();
			for(int i = 0; i < front.children.size(); i++) {
				System.out.print(front.children.get(i).data+" ");
				queue.offer(front.children.get(i));
			}
			size--;
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		GenericTree<Integer> root = createGenericTree();
		printTreeLevelwise(root);
	}
}
