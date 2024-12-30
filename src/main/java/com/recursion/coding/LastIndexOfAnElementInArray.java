package com.recursion.coding;

public class LastIndexOfAnElementInArray {

	/*
	 * To find the last index of an given element, we have to iterate till the last index of an array.
	 * Have to create a function with arguments arr, ele, startIndex and LastIndex
	 * Idea is if the given element is Present then have to update lastIndex with the index pos.
	 * Once we reached the iteration till arr.length, then  simply return lastIndex.
	 */
	
	public static int lastIndexOfAnElement(int[] arr, int ele) {
		//return lastIndexOfAnElement(arr, ele, 0, -1);
		return lastIndex(arr, ele, 0);
	}
	public static int lastIndexOfAnElement(int[] arr, int ele, int startIndex, int lastIndex) {
		if(startIndex == arr.length)
			return lastIndex;
		if(arr[startIndex] == ele)
			lastIndex = startIndex;
		return lastIndexOfAnElement(arr, ele, startIndex + 1, lastIndex);
	}
	
	/*
	 * Below is the better approach, we can understand recursion in a better way if we debug the below solution.
	 */
	
	public static int lastIndex(int[] input, int x, int startIndex) {
		if(startIndex == input.length)
			return -1;
		int smallOutput = lastIndex(input, x, startIndex + 1);
		if(smallOutput != -1)
			return smallOutput;
		if(input[startIndex] == x)
			return startIndex;
		else
			return -1;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.out.println(lastIndexOfAnElement(new int[] {1, 2, 3, 2, 4, 5}, 2));
	}

}
