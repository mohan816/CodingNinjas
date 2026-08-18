package com.arrays.java;

public class Sort10 {
	
	public static void sort10(int[] arr) {
		int start = 0, end = arr.length-1;
		while(start < end) {
			if(arr[start] == 1 && arr[end] == 0) {
				start++;
				end--;
			}
			else if(arr[start] == 0 && arr[end] == 0) {
				end--;
			}
			else if(arr[start] == 0 && arr[end] == 1) {
				int a = arr[start];
				arr[start] = arr[end];
				arr[end] = a;
			}
			else {
				start++;
			}
		}
	}
	
	//optimized approach
	public static void optimizedApproach(int[] arr) {
		int start = 0, end = 0;
		while(end < arr.length) {
			if(arr[end] == 1) {
				int temp = arr[end];
				arr[end] = arr[start];
				arr[start] = temp;
				end++;
				start++;
			}
			else
				end++;
		}
		
	}
	
	

	public static void main(String[] args) {
		int[] arr = {0,1,1,0,1,0};
		optimizedApproach(arr);
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
		

	}

}
