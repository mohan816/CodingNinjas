package com.hashmap.java;

import java.util.HashMap;

/*
   Problem Statement:
   You are given an array of integers that contain numbers in random order. Write a program to find and return the number which occurs the maximum times in the given input.
   If two or more elements are having the maximum frequency, return the element which occurs in the array first.

Sample Input 1 :
2 12 2 11 12 2 1 2 2 11 12 2 6 
Sample Output 1 :2
Sample Input 2 :
7 2 2 4 8 4
Sample Output 2 :2
 */

/*If we use entrySet() in for each loop to iterate the key pair and find the maximum occurring number then it will give incorrect result. Because HashMap
wont store the values in the sequence how it's there in the array, it will store the key's based on the hash code. So when the array's have multiple 
numbers with same frquency then it fail if we use entry set.*/
public class MaximumFrequencyNumber {

	public static int findMaximumFrequencyNumber(int[] arr) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i = 0; i < arr.length; i++){
			if(map.containsKey(arr[i]))
				map.put(arr[i], (map.get(arr[i]) + 1));
			else
				map.put(arr[i], 1);
		}
		int maxCount = Integer.MIN_VALUE, maxNumber = Integer.MIN_VALUE;
		for(int i = 0; i < arr.length; i++){
			if(map.get(arr[i]) > maxCount){
				maxCount = map.get(arr[i]);
				maxNumber = arr[i];
			}
		}
		return maxNumber;
	}

	public static void main(String[] args) {
		int[] arr = {2,2,7,7,4,4};
		findMaximumFrequencyNumber(arr);
	}

}
