package com.arrays.java;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class VowelsAndConsonents {
	
	public static void countVowelsAndConsonents(String s) {
		char[] ch = s.replaceAll("\\s", "").toLowerCase().toCharArray();
		int vowelCount = 0, consonants = 0;
		for(int i = 0; i < ch.length; i++) {
		if(isVowel(ch[i]) == 1)
			vowelCount += 1;
		else
			consonants += 1;	
	}
		System.out.println("Vowel Count is "+vowelCount);
		System.out.println("Consonants count is "+consonants);
	}
	
	public static void replaceOn() throws IOException {
		System.out.println('f'+'i'+'y'+'a'+'z');
		FileReader file = new FileReader("./src/main/java/TestData/Mohan.txt");
		BufferedReader br = new BufferedReader(file);
		String content = br.readLine();
		String[] sh = content.split(" ");
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < sh.length; i++) {
			if(sh[i].equalsIgnoreCase("on")) {
				sh[i] = "in";
			    sb.append(sh[i]+" ");
			}
			else {
				sb.append(sh[i]+" ");
			}
		}
		System.out.println(sb.toString());
		String result = sb.toString().trim();
		
		FileWriter fileWriter = new FileWriter("./src/main/java/TestData/Mohan2.txt");
		BufferedWriter br1 = new BufferedWriter(fileWriter);
		br1.write(result);
		br1.close();
	}
	
	public static int isVowel(char ch) {
		return ch == 'a' || ch == 'i' || ch == 'e' || ch == 'o' || ch == 'u' ? 1 : 0;
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//countVowelsAndConsonents("RING Central");
		replaceOn();

	}

}
