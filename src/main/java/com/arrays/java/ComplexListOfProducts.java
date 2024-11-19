package com.arrays.java;

import java.util.*;

public class ComplexListOfProducts {

	public static int duplicateProducts(String[] name, int[] price, int[] weight) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for(int i = 0; i < name.length; i++) {
			name[i] = name[i] + price[i] + weight[i];
		}
		for(int i = 0; i < name.length; i++) {
			map.put(name[i], map.getOrDefault(name[i], 0) + 1);
		}
		int count = 0;
		for(Map.Entry<String, Integer> entry: map.entrySet()) {
			if(entry.getValue() > 1) {
				count += entry.getValue();
				System.out.println(entry.getKey() +" "+entry.getValue());
			}
		}
		return count;

	}

	public static void main(String[] args) {
		String[] name = {"ball", "bat", "glove", "glove", "glove"};
		int[] price = {2, 3, 1, 2, 1};
		int[] weight = {2, 5, 1, 1, 1};
		System.out.println("Duplicate product count is "+ duplicateProducts(name, price, weight));

	}

}
