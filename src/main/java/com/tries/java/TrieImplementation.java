package com.tries.java;

/*
 * Have to declare three functions in public for others to access
 *    1) add 2) remove 3) search
 */

public class TrieImplementation {
	//Root node must be private and assign with empty character with size children size of 26
	private TrieNode root;
	int numberOfWords;

	public TrieImplementation() {
		root = new TrieNode('\0');
		numberOfWords = 0;
	}
	/*
	 * 1) To add word, first we have to check the first character in the word is present in the trie, if it's present
	 *    then send this character as root, and check the next char is present, if it present then continue the same(send it as root and check
	 *    the next character is present)
	 * 2) If the character is not present then create and add to the respective index position.
	 */
	public void add(String word) {
		addHelper(root, word);
		numberOfWords++;
	}
	
	private void addHelper(TrieNode root, String word) {
		if(word.length() == 0) {
			root.isTerminal = true;
			return;
		}
		int childIndex = word.charAt(0) - 'A';
		if(root.children[childIndex] == null) {
			TrieNode child = new TrieNode(word.charAt(0));
			root.children[childIndex] = child;
			root.childCount++;
		}
		addHelper(root.children[childIndex], word.substring(1));
	}
	
	/*
	 * Created helper method to find out whether the word is exist or not
	 */
	public boolean search(String word) {
		return searchHelper(root, word);
	}
	
	/*
	 * 1) Base condition -> If the word length() is 0, which means we reached the empty string so we have to check the root is terminal
	 *    or not, If it is terminal which means the word is exist so return true else return false.
	 * 2) In the induction step, just check the first character of the string is present in the root children, if not return null
	 *    which means the word is not present.
	 * 3) In the induction hypothesis, just return searchHelper with root and word.substring(1)
	 */
	private boolean searchHelper(TrieNode root, String word) {
		if(word.length() == 0)
			return root.isTerminal;
		int childIndex = word.charAt(0) - 'A';
		if(root.children[childIndex] == null)
			return false;
		return searchHelper(root.children[childIndex], word.substring(1));
	}
	
	/*
	 * Create removeHelper to remove the word
	 */
	public void remove(String word) {
		if(!search(word)) {
			System.out.println("The word is not present");
			return;
		}
		removeHelper(root, word);
		numberOfWords--;
	}
	
	/*
	 * Once we reached the empty string, we have to check whether the root is having any node without null in the array
	 * if it's true which means some other words are existing, so change isTerminal to false.
	 * If not true then remove the character by assigning root to null.
	 */
	private void removeHelper(TrieNode root, String word) {
		if(word.length() == 0) {
			root.isTerminal = false;
			return;
		}
		int childIndex = word.charAt(0) - 'A';
		TrieNode child = root.children[childIndex];
		removeHelper(child, word.substring(1));
		if(!child.isTerminal && child.childCount == 0)
			root.children[childIndex] = null;
		    root.childCount--;
	}
	
	public int totalNumberOfWords() {
		return numberOfWords;
	}
		
}

