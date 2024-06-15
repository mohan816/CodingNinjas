package com.strings.java;

import java.util.Arrays;

public class MethodsString {
	
 public static void main(String[] args) {
	 String s = "Mohanrajanrajan";
	int  a = s.indexOf('a',7);
	System.out.println(a);
	int b = 30;
	String[] spitted = s.split("a",3);
	System.out.println(Arrays.toString(spitted));;
 }



}
