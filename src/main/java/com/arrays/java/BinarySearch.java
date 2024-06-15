package com.arrays.java;

public class BinarySearch {
	
	public static void binarySearch(int[] a, int si, int ei, int x) {
		
		int midIndex = 0;
		while(si <= ei) {
			if(a[midIndex = (si + ei)/2] == x) {
				System.out.println(midIndex);
			}
			if(a[midIndex] > x) {
				ei = midIndex - 1;
			}
			else {
				si = midIndex + 1;
			}	
		}
		if(a[midIndex] == x) {
			System.out.println("Element is present");
		}
		else {
			System.out.println("Element is not present");
		}
		
		
	}

	public static void main(String[] args) {
		int[] a = {3, 7, 10, 12, 17};
		binarySearch(a, 0, a.length -1, 9);

	}

}
