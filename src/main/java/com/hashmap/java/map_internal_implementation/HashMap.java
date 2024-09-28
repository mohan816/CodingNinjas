package com.hashmap.java.map_internal_implementation;

import java.util.ArrayList;

public class HashMap<K,V> {
	//Created the empty buckekArray, bucketSize(to increase the size of the array), size(To monitor the number of elements inserted)
	ArrayList<MapNode<K,V>> bucketArray;
	int bucketSize;
	int size;
	
	//Create the array while creating an object for HashMap
	public HashMap() {
		bucketArray = new ArrayList<>();
		bucketSize = 20;
		for(int i = 0; i < bucketSize; i++) {
			bucketArray.add(null);
		}
	}
	
	//Get the hash code after compression
	private int getHashCode(K key) {
		int hashCode = key.hashCode();
		return hashCode % bucketSize;
	}
	
	//Insert an element if it's not present, if it's present just add the value
	public void insert(K key, V value) {
		int hashCode = getHashCode(key);
		MapNode<K,V> head = bucketArray.get(hashCode);
		while(head != null) {
			if(head.key.equals(key)) {
				head.value = value;
				return;
			}
			head = head.next;
		}
		//After execution of the while loop head points different node, so to start from the first node
		head = bucketArray.get(hashCode);
		MapNode<K,V> newNode = new MapNode<K,V>(key,value);
		newNode.next = head;
		//After inserting the new node just setting it in the index position
		bucketArray.set(hashCode, newNode);
		size++;
		//If the bucket Array is 70% filled, then have to increase the size of the bucket array.
		if((1.0 * size) / bucketSize == 0.7)
			    reHashing();
	}
	
	//remove the specified key if it is present
	public V removeKey(K key) {
		int hashCode = getHashCode(key);
		MapNode<K,V> head = bucketArray.get(hashCode);
		MapNode<K,V> temp = head;
		MapNode<K,V> prev = null;
		while(head != null){
			if(head.key.equals(key)) {
				V value = head.value;
				if(prev == null) {
					prev = head.next;
					bucketArray.set(hashCode, prev);
				}
				else {
					prev.next = head.next;
				}
				size--;
				return value;
			}
			prev = head;
			head = head.next;
		}
		return null;
	}
	
	//checking the key is present or not
	public boolean containsKey(K key) {
		int hashCode = getHashCode(key);
		MapNode<K,V> head = bucketArray.get(hashCode);
		while(head != null) {
			if(head.key.equals(key))
				return true;
			head = head.next;
		}
		return false;
	}
	
	//Checking the value is present or not
	public boolean containsValue(V value) {
		for(int i = 0; i < bucketArray.size(); i++) {
			MapNode<K,V> head = bucketArray.get(i);
			while(head != null) {
				if(head.value.equals(value)) {
					return true;
				}
				head = head.next;
			}
		}
		return false;
	}
	
	public ArrayList<K> keySet(){
		ArrayList<K> keyList = new ArrayList<>();
		for(int i = 0; i < bucketArray.size(); i++) {
			MapNode<K,V> head = bucketArray.get(i);
			while(head != null) {
				keyList.add(head.key);
				head = head.next;
			}
		}
		return keyList;
	}
	
	//Just return the entry set
	public ArrayList<MapNode<K,V>> entrySet(){
		ArrayList<MapNode<K,V>> entryList = new ArrayList<>();
		for(int i = 0; i < bucketArray.size(); i++) {
			     MapNode<K,V> head = bucketArray.get(i);
			     while(head != null) {
			    	 entryList.add(head);
			    	 head = head.next;
			     }
		}
		return entryList;
	}
	
	public int mapSize() {
		return size;
	}
	
	public boolean isEmpty() {
		return bucketArray.size() == 0;
	}
	
	//Double the size of the bucketArray
	public void reHashing() {
		System.out.println((1.0 * size) / bucketSize);
			ArrayList<MapNode<K,V>> temp = bucketArray;
			bucketArray = new ArrayList<>();
			for(int i = 0; i < 2 * bucketSize; i++) {
				bucketArray.add(null);
			}
			size = 0;
			bucketSize = 2 * bucketSize;
			for(int i = 0; i < temp.size(); i++) {
				MapNode<K,V> head = temp.get(i);
				while(head != null) {
					K key = head.key;
					V value = head.value;
					insert(key,value);
					head = head.next;
				}
		}
	}

}
