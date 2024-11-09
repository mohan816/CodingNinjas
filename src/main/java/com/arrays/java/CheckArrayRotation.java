package com.arrays.java;

/*
 * You have been given an integer array/list(ARR) of size N. 
 * It has been sorted(in increasing order) and then rotated by some number 'K' (K is greater than 0) in the right hand direction.
 * Your task is to write a function that returns the value of 'K', that means, the index from which the array/list has been rotated.
 * 
 * Input arr = 5 6 1 2 3 4 output = 2 (5 and 6 are rotated)
 * Input arr = 10 20 30 1   output = 3(10, 20, 30 are rotated)
 */
public class CheckArrayRotation {
	
	/*
	 * 1) Starting from arr.length - 1 and decrement it by 1 till it reaches the index 0.
	 * 2) If arr[i] < arr[i - 1] is true means, then the element from zero to i - 1 are rotated, 
	 *    we have to return the K elements rights, so the number of k elements are value of i
	 * 3) If the loop completes it's index iterations then return 0, because zero elements are rotated.
	 * 
	 */
	public static int checkArrayRotation(int[] arr) {
		for(int i = arr.length - 1; i > 0; i--) {
			if(arr[i] < arr[i - 1])
				return i;
		}
		return 0;
	}

}
