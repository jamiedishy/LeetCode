package dailyCoding;

public class Day29 {
//	This problem was asked by Amazon.
//	Run-length encoding is a fast and simple method of encoding strings. The basic idea is to represent repeated successive characters as a single count and character. For example, the string "AAAABBBCCDAA" would be encoded as "4A3B2C1D2A".
//	Implement run-length encoding and decoding. You can assume the string to be encoded have no digits and consists solely of alphabetic characters. You can assume the string to be decoded is valid.

	public static String encode(String s) {
		int i = 0;
		int j = i + 1;
		String encodedString = "";
		
		while (i < s.length()) {
			if (j >= s.length()) {
				int prefixNum = s.length() - i;
				encodedString += prefixNum + "" + s.charAt(i);
				break;
			}
			else if (s.charAt(i) != s.charAt(j)) {
				int prefixNum = j - i;
				encodedString += prefixNum + "" + s.charAt(i);
				i = j;
			}
			else {
				j++;
			}
		}
		return encodedString;
	}
	
	public static String decode(String s) { // O(n^2)
		int i = 0;
		String decodedString = "";
		
		while (i < s.length()) {
			decodedString += repeat(s.charAt(i) - '0', s.charAt(i+1)) + "";
			i += 2;
		}
		return decodedString;
	}
	
	public static String repeat(int val, char letter) {
		String s = "";
		for (int i = 0; i < val; i++) {
			s += letter + "";
		}
		return s;
	}
	
	public static void main(String[] args) {
		String s = "AAABCCZZA";
		System.out.println(encode(s));
		String encryptedString = "3A1B2C2Z1A";
		System.out.println(decode(encryptedString));
	}
}
