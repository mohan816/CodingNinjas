package com.strings.java;

public class HighestOccurringCharacter {
	static final int MAX_CHAR = 256;
	static char ch1 = '\u0000';
	
	public static void highestOccuringChar(String str) {
		 int max = Integer.MIN_VALUE;
		//creating an array of size 256 (ASCII_SIZE)  
		int count[] = new int[MAX_CHAR];  
		//finds the length of the string  
		int len = str.length();  
		//initialize count array index  
		for (int i = 0; i < len; i++)  
		count[str.charAt(i)]++;  
		//create an array of given String size  
		char ch[] = new char[str.length()];  
		for (int i = 0; i < len; i++)   
		{  
			
		 ch[i] = str.charAt(i); 
		 int find = 0;
		   

        for (int j = 0; j <= i; j++) { 
        	//if any matches found 
        	if (str.charAt(i) == ch[j]) {
	           find++; 
        	}
        }
		if (find == 1) {
			if(max < count[str.charAt(i)]) {
				max = count[str.charAt(i)];
				ch1 = str.charAt(i);
			}
		}
		//prints occurrence of the character   
		//System.out.println("The occurrence of "+ str.charAt(i)+ " is: " + count[str.charAt(i)]);  
		} 
		System.out.println("The occurrence of "+ ch1 + " is: " + max);
		} 
		

	public static void main(String[] args) {
		String s = "aaaabbbcccdeee";
		 highestOccuringChar(s);

	}

}
