package com.hashmap.java.map_internal_implementation;

public class MapNode<K,V> {
   
	K key;
	V value;
	MapNode<K,V> next;
	public MapNode(K key, V value) {
		this.key = key;
		this.value = value;
	}
	
	public K getKey(MapNode<K,V> entry) {
		return entry.key;
	}
	public V getValue(MapNode<K,V> entry) {
		return entry.value;
	}
}
