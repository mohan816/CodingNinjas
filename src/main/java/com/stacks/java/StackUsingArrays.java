package com.stacks.java;

public class StackUsingArrays {

	private int[] data;
	private int top;

	public StackUsingArrays() {
		data = new int[10];
		top = -1;
	}

	public void push(int element) {
        for(int i = 0; i < data.length; i++) {
        	if(data[i] != 0) {
        		continue;
        	}
        	else {
        		data[i] = element;
        		break;
        	}
        }
	}
	public int top() {
		for(int i = data.length -1; i >= 0; i--) {
			if(data[i] != 0) {
				return data[i];
			}
			else {
				continue;
			}
		}
		
		return top;
		}
	public int pop() {
		for(int i = data.length -1; i >= 0; i--) {
			if(data[i] != 0) {
				int topElement = data[i];
				data[i] = 0;
				return topElement;
			}
			else {
				continue;
			}
		}
		return -1;
	}
	public int size() {
		int count = 0;
		for(int i = 0; i < data.length; i++) {
			if(data[i] != 0) {
				count = count + 1;
				continue;
				}
		}
		return count;
	}
	public boolean isEmpty() {
		if(data.length == 0) {
			return true;
		}
		return false;
	}
}
