package HackerRank;

import java.util.HashMap;

public class TwoStrings {
	
	public static String twoStrings(String s1, String s2) {
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < s2.length(); i++) {
			map.put(s2.charAt(i), 1);
		}
		
		for (int i = 0; i < s1.length(); i++) {
			if (map.containsKey(s1.charAt(i))) {
				return "YES";
			}
		}
		return "NO";
	}
	
	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = "world";
		System.out.println(twoStrings(s1, s2));
	}

}
