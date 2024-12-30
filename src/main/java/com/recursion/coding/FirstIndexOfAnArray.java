package com.recursion.coding;

public class FirstIndexOfAnArray {
	
	/*
	 * 1) Start from index 0, if the arr[element] is matches with the given element return index
	 * 2) Base condition, if the element is not there return -1, which mean startIndex reaches arr.length
	 * 3) induction step, just check an array element is matching with the given element, if return return the index.
	 * 4) Induction hypothesis, just call the function with arr, elementToSearch, and startIndex as arguments.
	 */
	
	public static int firstIndexOfAnArray(int[] arr, int ele) {
		return firstIndexOfAnArray(arr, ele, 0);
	}
	
	public static int firstIndexOfAnArray(int[] arr, int ele, int startIndex) {
		if(startIndex == arr.length)
			return -1;
		if(arr[startIndex] == ele)
			return startIndex;
		return firstIndexOfAnArray(arr, ele, startIndex + 1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println(firstIndexOfAnArray(new int[] {1, 2, 3, 3, 3, 4, 5}, 3));
	}

}
