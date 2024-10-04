package com.binarytree.java;

/*
 * 1) Each node have data and it's left and right child
 */
public class BinaryTree<T> {

   public T data;
   public BinaryTree<T> left;
   public BinaryTree<T> right;
   public BinaryTree(T data){
	   this.data = data;
   }
}
