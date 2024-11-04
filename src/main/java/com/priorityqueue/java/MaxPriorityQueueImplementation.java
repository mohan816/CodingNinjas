package com.priorityqueue.java;

import java.util.ArrayList;

/*
 * 1) Create a ArrayList, to store the elements(Instead of tree, array list is easy to implement but for the visualization
 *    we always have to think about binary tree), in order to achieve heap we have to follow below
 *       -> It should be complete binary tree, insertion should happen at the end, removal should happen at the first (We have to
 *          follow the heap order property value)
 *          
 *  2) Methods we are going to implement:
 *     getSize(), isEmpty(), getMax(), removeMax(), insert()
 */
public class MaxPriorityQueueImplementation<T> {
	
	private ArrayList<Element<T>> heap;
	
	public MaxPriorityQueueImplementation() {
		heap = new ArrayList<>();
	}
	
	//to get the size of the elements present, just return heap.size()
	public int getSize() {
		return heap.size();
	}
	
	//if the size is zero, then return true
	public boolean isEmpty() {
		return getSize() == 0;
	}
	
	//If the list is empty throw an error, else return the zero'th index value
	public Element<T> getMax() throws EmptyPriorityQueueException{
		if(isEmpty())
			throw new EmptyPriorityQueueException();
		return heap.get(0);
	}
	
	//Insert an element at last, and have to check the parent must be greater than it's priority else we have to swap till the parent
	//greater than it's child node.
	public void insert(T value, int priority) {
		Element<T> elementToInsert = new Element<>(value, priority);
		heap.add(elementToInsert);
		int childIndex = heap.size() - 1;
		int parentIndex = (childIndex - 1)/2;
		while(parentIndex >= 0) {
			if(heap.get(parentIndex).priority >= heap.get(childIndex).priority)
				    return;
		    Element<T> temp = heap.get(childIndex);
		    heap.set(childIndex, heap.get(parentIndex));
		    heap.set(parentIndex, temp);
		    childIndex = parentIndex;
		    parentIndex = (childIndex - 1)/2;
		}
	}
	
	/*
	 * 1) To remove the max, we have to get it and store. Then we have to replace it with an element which is present in the last index position.
	 * 2) Then we have ensure that both the child elements are lesser than parent, if it's true then exit, else find the child which is having
	 *    greater priority then swap it with the parent. Continue the same process till the childs are lesser than the parent.
	 */
      public Element<T> removeMax() throws EmptyPriorityQueueException{
    	  if(isEmpty())
    		  throw new EmptyPriorityQueueException();
    	  Element<T> max = heap.get(0);
    	  heap.set(0, heap.get(heap.size() - 1));
    	  heap.remove(heap.size() - 1);
    	  int parentIndex = 0, leftChildIndex = 2 * parentIndex + 1, rightChildIndex = 2 * parentIndex + 2, maxIndex = parentIndex;
    	  while(leftChildIndex < heap.size()) {
    		  if(heap.get(maxIndex).priority < heap.get(leftChildIndex).priority)
    			      maxIndex = leftChildIndex;
    		  if(heap.get(maxIndex).priority < heap.get(rightChildIndex).priority)
    			      maxIndex = rightChildIndex;
    		  if(parentIndex == maxIndex)
    			  return max;
    		  Element<T> temp = heap.get(maxIndex);
    		  heap.set(maxIndex, heap.get(parentIndex));
    		  heap.set(parentIndex, temp);
    		  parentIndex = maxIndex;
    		  leftChildIndex = 2 * parentIndex + 1;
    		  rightChildIndex = leftChildIndex + 1;
    	  }
    	  return max;
      }
}
