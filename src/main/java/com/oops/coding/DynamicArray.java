package com.oops.coding;

public class DynamicArray {
	
	private int[] data;
	private int nextElement;
	
	public DynamicArray() {
		data = new int[10];
		nextElement = 0;
	}
	
	public int size() {
		return nextElement;
	}
	public int get(int i) {
		if(i >= nextElement) {
			return -1;
		}
		return data[i];
	}
	public void add(int element) {
		if(nextElement == data.length) {
			doubleCapacity();
		}
		data[nextElement] = element;
		nextElement++;
	}
	public void doubleCapacity() {
		int temp[] = data;
		data = new int[2 * temp.length];
		for(int i = 0; i < temp.length; i++) {
			data[i] = temp[i];
		}
	}
	public void set(int element, int i) {
		if(i >= nextElement) {
			return;
		}
		data[i] = element;
	}
	public void removeLast() {
		data[nextElement - 1] = 0;
		nextElement--;
	}
	public void remove(int i) {
		if(i >= nextElement) {
			return;
		}
		for(int elementPosition = i; elementPosition < nextElement; elementPosition++) {
			if(elementPosition == nextElement - 1) {
				nextElement--;
				return;
			}
			/*
			 * if(elementPosition == nextElement - 1) { nextElement--; return; }
			 */
			data[elementPosition] = data[elementPosition + 1];
		}
		nextElement--;
	}
	
}
