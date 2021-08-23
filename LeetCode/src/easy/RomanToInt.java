package easy;

import java.util.HashMap;
import java.util.Map;

public class RomanToInt {

	public int romanToInt(String s) {
		// sliding window total length 2 O(1) space
		int j = 0;
		int k = 2;
		// tracks final sum O(1) space
		int runningSum = 0;
		// map of roman to int values O(1) space
		Map<String, Integer> map = this.populateRomanToIntMap();

		// O(n) time complexity
		while (j < s.length()) {
			if (k > s.length() || !map.containsKey(s.substring(j, k))) {
				String temp = Character.toString(s.charAt(j));
				runningSum += (int) map.get(temp);
				j += 1;
				k += 1;
			} else {
				runningSum += (int) map.get(s.substring(j, k));
				j += 2;
				k += 2;
			}
		}
		return runningSum;
	}
	
	// utility method 
	public Map<String, Integer> populateRomanToIntMap() {
		Map<String, Integer> map = new HashMap<>();
		map.put("I", 1);
		map.put("V", 5);
		map.put("X", 10);
		map.put("L", 50);
		map.put("C", 100);
		map.put("D", 500);
		map.put("M", 1000);
		map.put("IV", 4);
		map.put("IX", 9);
		map.put("XL", 40);
		map.put("XC", 90);
		map.put("CD", 400);
		map.put("CM", 900);
		return map;
	}

	public static void main(String[] args) {
		RomanToInt obj = new RomanToInt();
		System.out.println(obj.romanToInt("LVIII"));
	}

}
