package com.java.fundamentals;

public class Score_Generics<T> {
 T value;
 public int counter = 0;
 public Score_Generics() {
	 counter++;
 }
 public Score_Generics(T v) {
	 value = v;
 }
 
 public static void main(String[] args) {
		Score_Generics<Integer> int1 = new Score_Generics<Integer>();
		Score_Generics<Integer> int2 = new Score_Generics<Integer>();
		Score_Generics<Double> double1 = new Score_Generics<Double>();
		
		System.out.println(int1.counter);
		System.out.println(int2.counter);
		System.out.println(double1.counter);
		
	}
}

