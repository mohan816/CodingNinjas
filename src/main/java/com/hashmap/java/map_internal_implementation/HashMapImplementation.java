package com.hashmap.java.map_internal_implementation;

public class HashMapImplementation {
	
	public static void main(String[] args) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i = 1; i < 30; i++){
			map.insert(i, i);
			map.removeKey(i);
		}
		
		System.out.println(map.keySet());
		for(MapNode<Integer, Integer> pairs: map.entrySet())
			System.out.println(pairs.getKey(pairs) +"  "+pairs.getValue(pairs));
		
	}
}
