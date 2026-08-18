package com.recursion.coding;

public class BinarySearch {
	
	/*
	 * If the array is sorted and we have to find element in it, then we can use BinarySearch algorithm
	 * 
	 * To find an element in the array first we have to find the mid position and have to check the mid position element is equal to
	 * the element which we have to find, if it's true just return the index position. if not just compare the mid element is greater or not
	 * if it's greater than the startIndex must be mid + 1, if not then the endIndex postion must be mid - 1.
	 * Call the induction hypothesis in both cases with respective arguments.
	 * And the base condition is once the start is greater then end return -1.
	 */
	
	public static int binarySearch(int[] arr, int ele) {
		return binarySearch(arr, ele, 0, arr.length - 1);
	}
	
	public static int binarySearch(int[] arr, int ele, int startIndex, int endIndex) {
		if(startIndex > endIndex)
			return -1;
		int mid = (startIndex + endIndex) / 2;
		if(arr[mid] == ele)
			return mid;
		else if(arr[mid] > ele)
			return binarySearch(arr, ele, startIndex, mid - 1);
		else
			return binarySearch(arr, ele, mid + 1, endIndex);
		
	}
	
	public static void main(String[] args) {
		int[] arr = {1, 2, 2, 2, 2};
		System.out.println("Index position is "+binarySearch(arr, 2));
	}
	
	
	
	
	

}
