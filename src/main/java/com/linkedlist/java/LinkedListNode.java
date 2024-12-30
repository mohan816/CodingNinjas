package com.linkedlist.java;

/*
 * Each node in the linked list contains data and next node address
 */

public class LinkedListNode<T> {
     T data;
     LinkedListNode<T> next;
     
     public LinkedListNode(T data) {
         this.data = data;
     }
}
