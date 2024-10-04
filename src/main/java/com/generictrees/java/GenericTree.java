package com.generictrees.java;

import java.util.ArrayList;

//Created ArrayList, because each node have multiple child nodes

public class GenericTree<T> {
	
	T data;
	ArrayList<GenericTree<T>> children;
	
	public GenericTree(T data) {
		this.data = data;
		children = new ArrayList<GenericTree<T>>();
	}

}
