package com.java.fundamentals;

public class TypeGeneric<T,S> {
	
	T name;
	S age;
	
	/*
	 * public TypeGeneric() {
	 * 
	 * }
	 */
	
	public TypeGeneric(T name, S age) {
		this.name = name;
		this.age = age;
	}
	
	

	public S getAge() {
		return age;
	}
	public T getName() {
		return name;
	}

}
