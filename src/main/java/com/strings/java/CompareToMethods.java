package com.strings.java;

public class CompareToMethods {

	public static void main(String[] args) {
		String str1 = "MohOn";
		String str2 = "Mohonraj";
		System.out.println(str1);
		System.out.println(str2.substring(2));
		String substring = str2.substring(1);
		System.out.println(substring.indexOf("o"));
		System.out.println(str1.compareTo(str2));
		
		String s10 = "Mohan Rajan";
		System.out.println(s10.replaceFirst("an", "b"));

		//endsWith();
		System.out.println(str1.endsWith("n"));

		//replace()
		str1 = str1.replace("M", "N");
		System.out.println(str1);
		//replaceAll
		str1 =	str1.replaceAll(str1, "Mohanraja");
		System.out.println(str1);

		//replaceFirst()
		System.out.println(str1.replaceFirst("Moh", "Nat"));

		//split()
		String s = "Mohanrajan";
		//String[] a = s.split("a");
		String[] a = s.split("a", 5);
		for(int i = 0; i < a.length; i++) {
			System.out.print("After split " + a[i]);
		}
		System.out.println();
		//indexOf()
		String s1 = "Mohanrajan";
		System.out.println(s1.indexOf("a"));
		System.out.println(s1.indexOf("a", 4));
		//substring()
		System.out.println(s1.indexOf("an", 4));

		//valueOf()
		System.out.println(String.valueOf(10));
		String valueOf = String.valueOf(10);
		//toCharArray()
		char[] charArray = s1.toCharArray();
		for(int i = 0; i < charArray.length; i++) {
			System.out.print(charArray[i] +" ");
		}
		String s3 = "Mohan Rajana";
		String[] split = s3.split(" ");
		for(int i = 0; i <split.length; i++) {
			System.out.print(split[i].length());
		}
	}

}
