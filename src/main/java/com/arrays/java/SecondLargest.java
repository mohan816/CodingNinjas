package com.arrays.java;

public class SecondLargest {
	
	/*
	 * 1) Create two variables, namely firstLargest and secondLargest assign Integer.MIN_VALUE for both variables
	 * 2) Going to iterate an array from 0th index to the last index
	 * 3) First I will compare arr[i] is greater then firstLargest, if it's true then i assign the firstLargest
	 *    value to the second largest and I will assign arr[i] to the first Largest.
	 * 4) else I will check arr[i] is greater than secondlargest if it;s true then I will assign arr[i] to the secondLargest.
	 */
	
	public static int secondLargest(int[] arr) {
		int firstLargest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > firstLargest) {
				secondLargest = firstLargest;
				firstLargest = arr[i];	
			}
			else if(arr[i] > secondLargest) {
				if(arr[i] == firstLargest)
					continue;
				secondLargest = arr[i];
			}
				
		}
		return secondLargest;
	}
	
	public static int thirdLargest(int[] arr) {
		int firstLargest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE, thirdLargest = Integer.MIN_VALUE;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > firstLargest) {
				thirdLargest = secondLargest;
				secondLargest = firstLargest;
				firstLargest = arr[i];
			}
			else if(arr[i] > secondLargest) {
				if(arr[i] == firstLargest)
					 continue;
				thirdLargest = secondLargest;
				secondLargest = arr[i];
			}
			else if(arr[i] > thirdLargest) {
				if(arr[i] == secondLargest)
					continue;
				thirdLargest = arr[i];
				
			}
		}
		return thirdLargest;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] arr = {10, 50, 100, 1, 100, 99, 99, 101};
        System.out.println("The Second Largest number is "+secondLargest(arr));
        System.out.println("The Third Largest number is "+thirdLargest(arr));
	}

}
