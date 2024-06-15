package com.strings.java;

public class ToFindVowels {

	public static void main(String[] args) {
		String str = "Mohanrajan";
		String str1 = "aieou";
		String str2 ="";
		int count = 0;
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(ch == 'a' || ch == 'i' || ch == 'e' ||ch == 'o' || ch == 'u') {
				count ++;
                str2 = str2 + ch;
			}
			
			}
		System.out.println(str2 +count);
		}

	}


