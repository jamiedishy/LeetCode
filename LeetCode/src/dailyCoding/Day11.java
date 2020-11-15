package dailyCoding;

import java.util.*;
import java.util.Arrays;
import java.util.HashMap;

public class Day11 {
//	This problem was asked by Twitter.
//	Implement an autocomplete system. That is, given a query string s and a set of all possible query strings, return all strings in the set that have s as a prefix.
//	For example, given the query string de and the set of strings [dog, deer, deal], return [deer, deal].
//	Hint: Try preprocessing the dictionary into a more efficient data structure to speed up queries.

//	public ArrayList<String> samePrefix(String s, String[] set) { // o(n)
//		ArrayList<String> equalPrefix = new ArrayList<String>();
//		
//		for (int i = 0; i < set.length; i++) {
//			if (set[i].length() >= s.length()) {
//				if (s.equals(set[i].substring(0, s.length()))) {
//					equalPrefix.add(set[i]);
//				}
//			}
//		}
//
//		return equalPrefix;
//		
//	}
	
	public class Trie {
		private Node root;
		public Trie() {
			root = new Node('\0'); // empty character
		}
		public void insert(String word) {
			Node curr = root;
			for (int i = 0; i < word.length(); i++) {
				char c = word.charAt(i);
				if (curr.children[c-'a'] == null) {
					curr.children[c-'a'] = new Node(c);
				}
				curr = curr.children[c-'a']; // moving down the chain inside of our tree
			}
			curr.isWord = true; // last char is marked as true
		}
		
		public boolean search(String word) {
			Node node = getNode(word); // is word inside of our trie?
			return node != null && node.isWord;
		}
		public boolean startsWith(String prefix) {
			return getNode(prefix) != null;
		}
		private Node getNode(String word) { // helper function
			Node curr = root;
			for (int i = 0; i < word.length(); i++) {
				char c = word.charAt(i);
				if (curr.children[c-'a'] == null) {
					return null;
				}
				curr = curr.children[c-'a'];
			}
			return curr;
		}
	}
	
	class Node {
		public char c;
		public boolean isWord;
		public Node[] children;
		
		public Node(char c) {
			this.c = c;
			isWord = false;
			children = new Node[26]; // every node is pointing to up to 26 other nodes... this is how it becomes a tree... 26 letters of alphabet
		}
	}

	public static void main(String[] args) {
		String s = "de";
		String[] set = { "dog", "deer", "deal", "hi" };
		Day11 c = new Day11();
//		System.out.println(c.samePrefix(s, set));
	}
}
