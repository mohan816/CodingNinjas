package com.java.fundamentals;

public class SelectionSort {

	public static void selectionSort(int[] arr) {
    	for(int i=0; i<arr.length-1; i++){
            int min = Integer.MAX_VALUE, index = -1;
            for(int j=i; j<arr.length; j++){
                if(arr[j] < min){
                    min = arr[j];
                    index = j;     
                }
                }
                int temp = arr[index];
                arr[index] = arr[i];
                arr[i] = temp;
                
            }
        }
	public static void printArray(int[] arr) {
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println(arr);
	}
	public static void main(String[] args) {
		int[] arr = {1,7,4,0,9,4};
		selectionSort(arr);
		System.out.println(arr);
		printArray(arr);
	}

}
