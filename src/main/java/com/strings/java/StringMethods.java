package com.strings.java;

public class StringMethods {

	public static void main(String[] args) {
		// 1) int indexOf(int ch, int fromIndex)
		String s = "Mohanrajan";
		
		for(int i=0; i<s.length(); i++) {
			int count = 1;
			if(s.charAt(i)=='0') {
			     continue;
			}
			for(int j=i+1;j<s.length();j++) {
				 if(s.charAt(i) == s.charAt(j)) {
					count++;
				s.replace(s.charAt(j), '0');
				}
			}
			if(count>1) {
				System.out.println(s.charAt(i)+" is a duplicate and it presents "+count+" times");
			}
			
			//System.out.println(s.charAt(i)+" presents "+count+" times");
		}
		System.out.println(s.indexOf(97));
		System.out.println(s.indexOf(97,4));
		
		// 2) int indexOf(String substring)
		System.out.println(s.indexOf("a"));
		System.out.println(s.indexOf("a", 4));
		
		// 3)
		/*
		 * //String[] split = s.split("a",count+1); for(int i=0; i<split.length; i++) {
		 * System.out.println(split[i]); }
		 */

	}

	
}
