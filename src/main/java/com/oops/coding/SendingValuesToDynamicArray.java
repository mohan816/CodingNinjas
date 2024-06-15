package com.oops.coding;

public class SendingValuesToDynamicArray {

	public static void main(String[] args) {
		
		DynamicArray dr = new DynamicArray();
		
		for(int i = 0; i < 20; i++) {
			dr.add(10 + i);
		}
		System.out.println(dr.size());
		System.out.println(dr.get(15));
		dr.remove(15);
		for(int i = 0; i < dr.size(); i++) {
			System.out.print(dr.get(i)+" ");
		}

	}

}
