package com.recursion.coding;

public class LastIndexOfX {
	
	/*
	 *  Logic is have to start from last index, and check whether the value is equal to given element, if it's true return the index 
	 *  How can we achieve in recursion?
	 *     idea is we have to return the logic of smaller input, which means if the length is 0, no element is present have to return -1.
	 *     it's the base condition.
	 *     Induction step, have to check the element in the index is equal to the given element. If it's true return the index
	 *     Induction hypothesis, just call the function with arguments
	 */
	
	public static int lastIndexOfX(int[] arr, int ele) {
		return lastIndexOfX(arr, ele, arr.length);
	}
	
	public static int lastIndexOfX(int[] arr, int ele, int length) {
		if(length == 0)
			return -1;
		if(arr[length - 1] == ele)
			return length - 1;
		return lastIndexOfX(arr, ele, length - 1);
	}
	
	public static void main(String[] args) {
		System.out.println(lastIndexOfX(new int[] {1, 2, 3, 3, 4}, 5));
	}

}
