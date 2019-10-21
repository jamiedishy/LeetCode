package easy;

public class LongestCommonPrefix {
	
	static String[] a = {"flower", "flight", "flow"};
	
	public static String commonPrefix(String[] strs) {
		int i = 0;
		int j = 1;
		String value = strs[i].substring(0, j);
		String prefix = "";
		
		if (a.length == 0) {
			return prefix;
		}
		
		while (i < strs.length && j <= strs[i].length()) {
			if (value.equals(strs[i].substring(0, j))) {
				if (i == strs.length-1) {
					i = 0;
					j++;
					prefix = value;
					value = strs[i].substring(0, j);
				}
				else {
					i++;
				}
			}
			else {
				return prefix;
			}
		}
		return prefix;
	}
	
	public static void main(String[] args) {
		System.out.println(commonPrefix(a));
	}

}
