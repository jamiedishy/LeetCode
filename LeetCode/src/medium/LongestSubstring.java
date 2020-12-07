package medium;

import java.util.*;

public class LongestSubstring {
	
	public static int longestSubstringNoRepeatingChars(String s) {
		// use a hashset as a sliding window because contains() is O(1) constant time.
		int currMax = 0;
		int finalMax = 0;
		int i = 0;
		int j = i + 1;
		HashSet<Character> set = new HashSet<>();
		
		set.add(s.charAt(i));
		currMax++;
		
		if (s.length() <= 1) {
            if (s.length() == 1) {
            	finalMax = 1;
                return finalMax;
            }
            else {
                return finalMax;
            }
        }
		
		while (j < s.length() && i < s.length()) {
			if (!set.contains(s.charAt(j))) {
				set.add(s.charAt(j));
				currMax++;
				j++;
				if (currMax > finalMax) {
					finalMax = currMax;
				}
			} 
			else {
				set.remove(s.charAt(i));
				i++;
				currMax--;
			}
			
		}
		
		return finalMax;
	}
	
	public static void main(String[] args) {
		String s = "pwwkew";
		System.out.println(longestSubstringNoRepeatingChars(s));
	}

}
