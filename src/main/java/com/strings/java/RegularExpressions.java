package com.strings.java;

public class RegularExpressions {
	
	static public void add(int[] a) {
		
	}
	

	public static void main(String[] args) {
		//add(new int[]{10, 20, 30, 40, 50, 60, 70, 80});
		   //Regular expressions
		String s = "Mohan Rajan123%$_";
		System.out.println(s.replaceAll("[\\W_]", ""));
		    /* 1) \\s -> it removes space character
             2) \\S -> it removes except space character
             3) \\d -> it removes digits 0 t0 9
             4) \\D - > It removes except digits
             5) \\w  -> It removes alpha numeric character
             6) \\W -> It removes except alpha numeric (a-zA-Z0-9_)
             7 .   -> It removes everything*/
		
		    /* [^a-z] 
		     * 
		     */
             
	}

}
