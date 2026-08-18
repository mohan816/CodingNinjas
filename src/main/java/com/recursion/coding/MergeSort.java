package com.recursion.coding;

public class MergeSort {
	
	/*
	 * 1) Divide the array into two half's
	 * 2) Call the recursion on each half's
	 * 3) Then assign the values to the respective index positions.
	 * 
	 * 1) Base case -> If arr.length is <= 1, return it
	 * 2) Induction hypothesis -> Have to call the recursion on the both the half's
	 * 3) Then in the induction step, we have to write the logic, we proved base case and we assumed that induction hypothesis is true
	 *    then in the induction step compare both the first and second half array and assign it to the arr.
	 */
	
	public static void mergeSort(int[] arr) {
		if(arr.length <= 1)
			return;
		int[] firstHalf = new int[arr.length/2];
		int[] secondHalf = new int[arr.length - firstHalf.length];
		for(int i = 0; i < firstHalf.length; i++)
			firstHalf[i] = arr[i];
		for(int j = 0; j < secondHalf.length; j++)
			secondHalf[j] = arr[firstHalf.length + j];
		mergeSort(firstHalf);
		mergeSort(secondHalf);
		mergeSort(arr, firstHalf, secondHalf);
		
	}
	
	public static void mergeSort(int[] arr, int[] firstHalf, int[] secondHalf) {
		int i = 0, j = 0, k = 0;
		while(i < firstHalf.length && j < secondHalf.length) {
			if(firstHalf[i] <= secondHalf[j]) {
				arr[k] = firstHalf[i];
				i++;
				k++;
			}
			else {
				arr[k] = secondHalf[j];
				k++;
				j++;
			}
		}
		while(i < firstHalf.length) {
			arr[k] = firstHalf[i];
			i++;
			k++;
		}
		while(j < secondHalf.length) {
			arr[k] = secondHalf[j];
			j++;
			k++;
		}
	}
	
	
	public static void main(String[] args) {
		int[] arr = {3, 10, 7, 2, 1, 0};
		mergeSort(arr);
		for(int i = 0; i < arr.length; i++)
			System.out.print(arr[i]+" ");
	}

}
