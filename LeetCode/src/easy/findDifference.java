package easy;

import java.util.Arrays;

public class findDifference {
	
	
//	public char extraLetter(String s, String t) { // o(nlogn) time o(n) space
//		
//		if (s.equals("")) {
//			return t.charAt(0);
//		}
//		
//		char[] sArr = s.toCharArray();
//		char[] tArr = t.toCharArray();
//		Arrays.sort(sArr);
//		Arrays.sort(tArr);
//		
//		for (int i = 0; i < sArr.length; i++) {
//			if (sArr[i] != tArr[i]) {
//				return tArr[i];
//			}
//		}
//		return sArr[0]; // never occurs
//	}
	
	public char extraLetter(String s, String t) { // o(n) time, o(1) space
		
		int charValue = 0;
		
		for (int i = 0; i < s.length(); i++) {
			if (i == s.length()-1) {
				charValue -= s.charAt(i);
				charValue += t.charAt(i) + t.charAt(i+1);
			} else {
				charValue -= s.charAt(i);
				charValue += t.charAt(i);
			}
		}
		return (char) charValue;
	}
	
	
	public static void main(String[] args) {
		String s = "caat";
		String t = "tcawa";
		findDifference c = new findDifference();
		System.out.println(c.extraLetter(s, t));
	}

}
