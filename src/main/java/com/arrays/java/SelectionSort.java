package com.arrays.java;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr = {10, 5, 25, 0, 1, 30};
		selectionSort(arr);
		printArray(arr);
	}
	public static void selectionSort(int[] arr) {
		int n = arr.length;
		//we are taking n-1 round, because at the end of each round min value will be in round position.
		//So no need to compare the last element, because single element is already sorted in array
		for(int i=0; i<n-1; i++) {
			int min = Integer.MAX_VALUE; // keeping the max int value in min variable to compare with the arr elements
			int minIndex = -1;
			for(int j=i; j<n; j++) {
				if(arr[j] < min) {
					min = arr[j]; //Once array of j value is less than min value then assigning arr value to min variable
					minIndex = j; //keeping the mininmum value index of array j in the minIndex variabe
				}
			}
			// So in each round putting the minimum value in arr[i] of index
			int temp = arr[minIndex]; 
			arr[minIndex] = arr[i];
			arr[i] = temp;
		}
	}
	public static void printArray(int[] arr) {
		int n = arr.length;
		for(int i=0; i<n; i++) {
			System.out.println(arr[i]);
		}
	}

}
