package com.binarytree.java;

/*
 * 1) Each node have data and it's left and right child
 */
public class BinaryTree<T> {

   T data;
   BinaryTree<T> left;
   BinaryTree<T> right;
   BinaryTree(T data){
	   this.data = data;
   }
}
