package dailyCoding;

import java.util.*;

public class Day27 {
//	This problem was asked by Facebook.
//	Given a string of round, curly, and square open and closing brackets, return whether the brackets are balanced (well-formed).
//	For example, given the string "([])[]({})", you should return true.
//	Given the string "([)]" or "((()", you should return false.
	
//	public static boolean isBalanced(String s) {
//		int i = 0;
//		int j = i + 1;
//		int temp = j;
//		
//		HashMap<Character, Character> map = new HashMap<>();
//		map.put('(', ')');
//		map.put('{', '}');
//		map.put('[', ']');
//		
//		while (j < s.length()) {
//			if (map.get(s.charAt(i)) != (s.charAt(j))) {
//				j++;
//			}
//			else {
//				temp = j;
//				i++;
//				j--;
//				while (i <= j) {
//					if (map.get(s.charAt(i)) != s.charAt(j)) {
//						return false;
//					}
//					i++;
//					j--;
//				}
//				i = temp + 1;
//				j = i + 1;
//				
//			}
//		}
//		if (i == s.length()-1 || map.get(s.charAt(0)) != s.charAt(s.length()-1)) {
//			return false;
//		}
//		return true;
//	}
	
	public static boolean isBalanced(String s) {
		Stack stack = new Stack();
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '{' || s.charAt(i) == '(' || s.charAt(i) == '[') {
				stack.push(s.charAt(i));	
			}
			if (stack.isEmpty()) {
				return false;
			}
			if (s.charAt(i) == '}') {
				char temp = (char) stack.pop();
				if (temp != '{') {
					return false;
				}
			}
			if (s.charAt(i) == ']') {
				char temp = (char) stack.pop();
				if (temp != '[') {
					return false;
				}
			}
			if (s.charAt(i) == ')') {
				char temp = (char) stack.pop();
				if (temp != '(') {
					return false;
				}
			}
		}
		return stack.isEmpty();
	}
	
	public static void main(String[] args) {
//		String s = "([{}])[]([{}])";
		String s = "([]))";
		System.out.println(isBalanced(s));
	}
}
