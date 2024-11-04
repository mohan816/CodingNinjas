package com.arrays.java;

import java.util.HashMap;

public class ArrayIntersection {
	
	/*
	 * 1) The idea is first I will iterate the second array and put it in the map with key and value
	 * 2) Then, I will iterate the first array and check the map contains the key if it contains key then I will check
	 *    the value is greater than zero, if both the condition satisfies mean then we can say there is an intersection
	 *    and i will decrease the value by 1 and put it in the map
	 */
	//Time Complexity -> O(n + m), space complexity O(m)
	public static void arrayIntersection(int[] arr1, int[] arr2) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i = 0; i < arr2.length; i++)
			map.put(arr2[i], map.getOrDefault(arr2[i], 0) + 1);
		for(int i = 0; i < arr1.length; i++) {
			if(map.containsKey(arr1[i]) && map.get(arr1[i]) > 0) {
				System.out.println(arr1[i]);
				map.put(arr1[i], map.get(arr1[i]) - 1);
			}
				
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//We have to print the intersection based on the order, so the expected output is 2, 4, 3
		int[] arr1 = {2, 6, 8, 5, 4, 3};
		int[] arr2 = {2, 3, 4, 7};
		arrayIntersection(arr1, arr2);
         
	}

}
