package com.strings.java;

public class CharacterInJava {

	public static void main(String[] args) {
	String s = "racecar kayak refer";
	String reverseEachWord = reverseEachWord(s);
	System.out.println(reverseEachWord);
	}
	public static String reverseEachWord(String str) {
		int n = str.length();
        String s = "";
        String s1 ="";
        int start = 0;
        for(int i = start; i < n; i++){
            char ch = str.charAt(i);
            if(ch != ' '){
                s = str.charAt(i) + s;
                if(i == n-1) {
                	s1 = s1+s+"";
                	String s2=s1;
                	return s2;
                }
            }
            else{
                s1 = s1 +s+" ";
                start = i + 1;
                s="";
            }
        }
        return s1;
}
	}
		
	

