package com.arrays.java;

public class MoveZerosToEnd {
	
	/*
	 *  This logic won't maintain the order, I mean for 302015, it wont give the output 321500, it give 312500, to maintain order we have
	 *  to think different logic.
	 * 1) Create two variable start and end, assign the value arr.length-1 to both the variables
	 *    because we are starting from the last index and moving it to zeroth index.
	 *    
	 * 2) Have the wile loop and the condition is start >= 0, once arr[start] = 0, then swap both start and end
	 *    decrement both the variables by 1. if the arr[start] not equal to zero then decrement only the start by 1.
	 *    
	 */
	
	public static void moveZerosToEnd(int[] arr) {
		int start = arr.length - 1, end = arr.length - 1;
		while(start >= 0) {
			if(arr[start] == 0) {
				int temp = arr[start];
				arr[start--] = arr[end];
				arr[end--] = temp;
			}
			else
				start--;
		}
	}
	/*
	 * Have to create two variables namely start and end, and both of them starts from zeroth index.
	 * once the end equals to arr.length, then we have to exit from the loop
	 * if arr[start] equals to zero and arr[end] also equals to zero then increase end by 1.
	 * If arr[start] == 0 and end not zero then swap it and increase both the variables by 1.
	 * else increase both start and end by 1.
	 */
	public static void moveZerosMaintainOrder(int[] arr) {
		int start = 0, end = 0;
		while(end < arr.length) {
			if(arr[start] == 0) {
				if(arr[start] == 0 && arr[end] != 0) {
					int temp = arr[start];
					arr[start++] = arr[end];
					arr[end++] = temp;
				}
				else
					end++;
			}
			else {
				start++;
				end++;
			}
				
		}
	}
	
	//optimized Solution
	/*
	 * Here the concept is we have to create two variables namely zero and non zero
	 * If arr[zero] != 0, then swap the values of arr[zero] and arr[nonZero] and increment nonZero by 1. Doing this
	 * helps us to move the zero to end of the array without changing the non zero's order.
	 * And for each iteration increase the zero variable by 1.
	 * 
	 */
	//Time Complexity O(n)
	public static void moveZeroOptimized(int[] arr) {
		int zero = 0, nonZero = 0;
		while(zero < arr.length) {
			if(arr[zero] != 0) {
				int temp = arr[zero];
				arr[zero] = arr[nonZero];
				arr[nonZero] = temp;
				nonZero++;
			}
			zero++;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int[] arr = {3, 0, 2, 0, 1, 5};
       moveZeroOptimized(arr);
       for(int i = 0; i < arr.length; i++) {
    	   System.out.print(arr[i]+" ");
       }
	}

}
