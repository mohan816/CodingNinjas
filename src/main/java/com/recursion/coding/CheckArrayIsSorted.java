package com.recursion.coding;

public class CheckArrayIsSorted {
	
	/*
	 * 1) If the length is 1 return true, because the length of the array is 1 and it's having one value in the array and that's the
	 *    base condition.
	 * 2) We start from last index and compare with previous index, if it's greater return false. 
	 * 3) Induction hypothesis is arr, length - 1
	 */
	
	public static boolean isSorted(int[] arr) {
		return isSorted(arr, arr.length);
	}
	
	public static boolean isSorted(int[] arr, int length) {
		if(length == 1)
			return true;
		if(arr[length - 2] > arr[length - 1])
			   return false;
		return isSorted(arr, length - 1);
		
	}
	
	/*
	 * This below approach starts from index 0, it's comparing the next element, if the next is lesser than the current element
	 * then return false, else continue till it reaches the last index position. Once it reached the last index position just
	 * return true.
	 */
	
	public static boolean isSorted(int startIndex, int[] arr) {
		if(startIndex == arr.length - 1)
			return true;
		if(arr[startIndex] > arr[startIndex + 1])
			return false;
		return isSorted(startIndex + 1, arr);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int[] arr = {10, 25, -1};
       System.out.println(isSorted(arr));
	}

}
