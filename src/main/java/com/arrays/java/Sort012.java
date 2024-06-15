package com.arrays.java;

public class Sort012 {
	
	public static void sort012(int[] arr) {
		int i = 0, nextZero = 0, nextEnd = arr.length-1;
		while(i < nextEnd) {
			if(arr[i] != 0 && arr[i] != 2) {
				i++;
			}
			else if(arr[i] == 0) {
				int temp = arr[nextZero];
				arr[nextZero] = arr[i];
				arr[i] = temp;
				nextZero++;
				i++;
			}
			else if(arr[i] == 2) {
				int temp = arr[i];
				arr[i] = arr[nextEnd];
				arr[nextEnd] = temp;
				nextEnd--;
			}
			
		}
	}

	public static void main(String[] args) {
		int[] arr = {1,0,2,1,0,1,2,0};
		sort012(arr);
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
