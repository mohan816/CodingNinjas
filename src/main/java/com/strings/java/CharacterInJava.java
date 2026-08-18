package com.strings.java;

public class CharacterInJava {

	public static void main(String[] args) {
	String s = "racecar kayak refer";
	String reverseEachWord = reverseEachWordInAString(s);
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
	
	public static String reverseEachWordInAString(String s) {
		if(s.length() == 1)
			return s;
		StringBuilder sb = new StringBuilder();
		String[] splittedString = s.split("\\s");
		for(int i = 0; i < splittedString.length; i++) {
			char[] charArray = splittedString[i].toCharArray();
			int start = 0, end = charArray.length - 1;
			while(start < end) {
				char temp = charArray[start];
				charArray[start] = charArray[end];
				charArray[end] = temp;
				start++;
				end--;
			}
			for(int j = 0; j < charArray.length; j++)
				sb.append(charArray[j]);
			sb.append(" ");
			charArray.toString();
		}
		return sb.toString().trim();
	}
	}
		
	

