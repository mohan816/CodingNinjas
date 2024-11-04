package com.arrays.java;

public class Sort01 {
	
	/*
	 * 1) Create two variables start and end and initialize 0 as value for both variables
	 * 2) Going to use while loop and the condition is end < arr.length
	 * 3) Once the end == arr.length, then have to exit the loop
	 * 4) The logic is if arr[end] equals to 0 then swap arr[start] and arr[end] increment both the start and the end.
	 */
	
	public static void sort01(int[] arr) {
		int start = 0, end = 0;
		while(end < arr.length) {
			if(arr[end] == 0) {
				int temp = arr[start];
				arr[start++] = arr[end];
				arr[end++] = temp;
			}
			else
				end++;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int[] arr = {0, 0, 0, 1, 0, 0, 0};
           sort01(arr);
           for(int i = 0; i < arr.length; i++) {
        	   System.out.print(arr[i]+" ");
           }
           
              
	}

}
