package com.java.fundamentals;

public class UsingGeneric {

	public static void main(String[] args) {
		/*
		 * TypeGeneric ty = new TypeGeneric(); System.out.println(ty.getName());
		 */
		
		TypeGeneric<String,Integer> t1 = new TypeGeneric<String,Integer>("Mohan", 10);
		
		  TypeGeneric<TypeGeneric<String,Integer>, Integer> str = new TypeGeneric<TypeGeneric<String,Integer>, Integer>(t1,25);
		  System.out.println(str.getAge());
		  System.out.println(str.getName().getName());
		  
		  TypeGeneric<Integer, TypeGeneric<String,Integer>> str1 = new TypeGeneric<Integer, TypeGeneric<String,Integer>>(25,t1);
		  System.out.println(str1.getAge());
		  System.out.println(str1.getName());
		 
		
		
		
		
		

	}

}
