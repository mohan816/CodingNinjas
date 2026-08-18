package com.tries.java;

import java.util.ArrayList;
import java.util.Scanner;

public class PatternMatching {
	
	/*Given a list of n words and a pattern p that we want to search.
	Check if the pattern p is present the given words or not. Return true if the pattern is present and false otherwise.
	
    words: abc def ghi cba
    pattern: de
	*/
	
	/*
	 * Solving this problem using suffix trie's
	 * 1) First add all the words to the trie (Ex: If the word is mohan, add mohan, ohan, han,an, n) follow the same approach
	 *    for all the words.
	 * 2) Now simply search whether given pattern is present in the trie.
	 */
	
	public static boolean patternSearch(ArrayList<String> words, String pattern) {
		TrieImplementation trie = new TrieImplementation();
		for(int i = 0; i < words.size(); i++) {
			for(int j = 0; j < words.get(i).length(); j++) {
				trie.add(words.get(i).substring(j));
			}
		}
		return trie.search(pattern);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  ArrayList<String> al = new ArrayList<>();
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the words");
      String word = sc.nextLine();
      System.out.println("Enter the pattern to search");
      String pattern = sc.nextLine();
      String[] words = word.split(" ");
      for(int i = 0; i < words.length; i++) {
    	  al.add(words[i].toUpperCase());
      }
      System.out.println(patternSearch(al, pattern.toUpperCase()));
	}

}
