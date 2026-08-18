package com.tries.java;

public class TestTrieImplementation {
	
	public static void main(String[] args) {
		TrieImplementation trie = new TrieImplementation();
		trie.add("NOTE");
		trie.add("NOTED");
		trie.add("NOTES");
		trie.remove("NOTE");
		System.out.println(trie.search("NOTE"));
		System.out.println(trie.search("NOTED"));
		System.out.println(trie.search("NOTES"));

		
	}

}
