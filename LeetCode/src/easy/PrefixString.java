package easy;

import java.util.HashSet;

public class PrefixString {
	 
	public boolean prefixString(String[] a, String[] b) { //o(n) time o(n) space
		HashSet<String> set = new HashSet<>();
		String temp = "";
		for (int i = 0; i < a.length; i++) {
			temp += a[i];
			set.add(temp);
		}
		
		for (int i = 0; i < b.length; i++) {
			if (set.contains(b[i]) == false) {
				return false;
			}
		}
		
		return true;
	}
	
	
	public static void main(String[] args) {
		String[] a = {"one", "two", "three"};
		String[] b = {"two", "onetwo"};
		PrefixString c = new PrefixString();
		System.out.println(c.prefixString(a, b));
	}
}
