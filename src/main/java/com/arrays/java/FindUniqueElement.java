package com.arrays.java;
import java.util.*;
public class FindUniqueElement {
	
	/*
	 * In a given array we have to find an unique element, where except one element all the elements present twice.
	 * I am going to use HashMap, I will insert an element in the map and increase it's value by 1 each time if the element comes
	 * Finally, I will iterate an HashMap and if the key contains a value of 1, then I will return that key
	 */
	
	public static int uniqueElement(int[] arr) {
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		for(int i = 0; i < arr.length; i++) {
//			if(map.containsKey(arr[i]))
//				map.put(arr[i], map.get(arr[i]) + 1);
//			else
//				map.put(arr[i], 1);
			map.put(arr[i], map.getOrDefault(arr[i],0) + 1);
			
		}
		
		for(Map.Entry<Integer, Integer> pair: map.entrySet()) {
			if(pair.getValue() == 2) {
				return pair.getKey();
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(uniqueElement(new int[] {1, 1, 2, 2, 3, 4, 4}));
        
	}

}
