package com.java.fundamentals;

import java.util.ArrayList;

public class NoPairsAllowed {

	public static void noPairsAllowed(ArrayList<String> a) {
		

		for(int i = 0; i < a.size(); i++) {

			int[] count = new int[256];
			String s = a.get(i);
			for(int j = 0; j < s.length(); j++) {
				count[s.charAt(j)]++;
			}
			int afterRemovingDuplicates = 0;

			for(int k = 0; k < count.length; k++) {
				if(count[k] > 1) {
					//System.out.println(count[s.charAt(k)]);
					afterRemovingDuplicates = count[k] / 2;	
				}
			}
			System.out.println(afterRemovingDuplicates);
			System.out.println("After end of each word");

		}


	}


	public static void main(String[] args) {

		ArrayList<String> a = new ArrayList<String>();
		a.add("add");
		a.add("boook");
		a.add("break");
		noPairsAllowed(a);
	}

}
