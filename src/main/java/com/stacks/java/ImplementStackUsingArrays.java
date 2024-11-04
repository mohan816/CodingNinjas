package com.stacks.java;

public class ImplementStackUsingArrays<T> {
	
	/*
	 * It's not possible to create an generic array, because we have to define the type of array while creating it.
	 * Created an size variable, to track till which index the elements are inserted in the array.
	 */
	private int[] arr;
	private int size;
	
	//Created the paramaterized constructor, to get the size of an array while creating an object.
	public ImplementStackUsingArrays(int sizeOfStack) {
		arr = new int[sizeOfStack];
	}
	
	/*
	 * Insert an element at the top of the stack
	 * if the size is equal to arr.length which means the array is full and we have to double it's size to insert the new elements.
	 */
	public void push(int ele) {
		if(size == arr.length) {
			doubleCapacity();
		}
		arr[size++] = ele;
	}
	
	/*
	 * It will return the last inserted element in the array
	 */
	public int peek() throws StackEmptyException {
		if(size == 0)
		    throw new StackEmptyException();
		return arr[size - 1];
	}
	
	/*
	 * It will remove the last inserted element in the array and points the previous element.
	 * If the array is empty then we have to throw an StackEmptyException
	 * If not then simply return arr[size - 1] and reduce the size by 1.
	 */
	public int pop() throws StackEmptyException {
		if(size == 0)
			throw new StackEmptyException();
		return arr[--size];
	}
	
	/*
	 * Just return the size variable, because it have the details of number of elements inserted and size - 1 points the last element
	 * position in the array.
	 */
	public int size() {
		return size;
	}

	/*
	 * If the size is zero then simply returns true, else return false.
	 */
	public boolean isEmpty() {
		return size == 0;
	}
	
	/*
	 * The intention is just to double the size of an array, for that have to create temp array to store the
	 * reference of arr, because if we create the arr of double the size then reference will be changed.
	 * The modifier type is private, because I don't want others to modify the size intentionally.
	 */
	private void doubleCapacity() {
		int[] temp = arr;
		arr = new int[arr.length * 2];
		for(int i = 0; i < temp.length; i++)
			arr[i] = temp[i];
	}
}
