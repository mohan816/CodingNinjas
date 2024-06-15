package com.strings.java;

public class SubString {

	public static void main(String[] args) {
		String s = "aaleex";
		for(int i = 0; i < s.length(); i++) {
			for(int j = 0; j < s.length() - i; j++) {
				System.out.println(s.substring(j, j + i + 1));
			}
		}
		// TODO Auto-generated method stub

	}

}
