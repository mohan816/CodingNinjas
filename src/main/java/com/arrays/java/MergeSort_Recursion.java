package com.arrays.java;

public class MergeSort_Recursion {
	//static int[] a;
	//static int[] b;
	
	public static void mergeSort(int[] input) {
		if(input.length == 1){
            return;
        }
       int[] a = new int[input.length/2];
       int[] b = new int[input.length - a.length];
        for(int i = 0; i < a.length; i++){
            a[i] = input[i];
        }
        for(int j = a.length; j < input.length; j++){
            b[j - a.length] = input[j];
        }
        mergeSort(a);
        mergeSort(b);
        sortMerge(a, b, input);
}
	public static void sortMerge(int[] a, int[] b, int[] k) {
		// int[] k = new int[a.length + b.length];
	        int i = 0;
	        int j = 0;
	        int d = 0;
	        while(i < a.length && j < b.length){
	            if(a[i] <= b[j]){
	                k[d] = a[i];
	                i++;
	                d++;
	            }
	            else{
	                k[d] = b[j];
	                j++;
	                d++;
	            }      
	        }
	        if(i < a.length){
	            while(i < a.length){
	                k[d] = a[i];
	                d++;
	                i++;
	            }
	        }
	        if(j < b.length){
	            while(j < b.length){
	                k[d] = b[j];
	                d++;
	                j++;
	            }
	        }
	        
	        }
	
	public static void printArray(int[] input) {
		for(int i = 0; i < input.length; i++) {
			System.out.println(input[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] c = {10, 20, 30, 1, 3};
		mergeSort(c);
		printArray(c);
		//sortMerge(a, b);
		//printArray(a);

	}

}
