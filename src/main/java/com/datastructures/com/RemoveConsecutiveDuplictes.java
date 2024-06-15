package com.datastructures.com;

import java.util.ArrayList;

public class RemoveConsecutiveDuplictes {
	
	
	public static ArrayList<Integer> removeConsecutiveDuplicates(int[] arr){
		ArrayList<Integer> result = new ArrayList<>();
		result.add(arr[0]);
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] != arr[i - 1]) {
				result.add(arr[i]);
			}
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {10, 20, 20, 40, 40 ,60, 20};
		ArrayList<Integer> result = removeConsecutiveDuplicates(arr);
		for(int i = 0; i < result.size(); i++) {
			System.out.print(result.get(i)+" ");
		}

	}

}
