package easy;

import java.util.Arrays;

public class AssignCookies {
//	Assume you are an awesome parent and want to give your children some cookies. But, you should give each child at most one cookie.
//	Each child i has a greed factor g[i], which is the minimum size of a cookie that the child will be content with; and each cookie j has a size s[j]. If s[j] >= g[i], we can assign the cookie j to the child i, and the child i will be content. Your goal is to maximize the number of your content children and output the maximum number.

	public int assignCookies(int[] g, int[] s) {
		Arrays.sort(g);
		Arrays.sort(s);

		int gPointer = 0;
		int sPointer = 0;
		int count = 0;

		while (gPointer < g.length && sPointer < s.length) {
			if (g[gPointer] > s[sPointer]) {
				sPointer++;
			} else {
				count++;
				sPointer++;
				gPointer++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		int[] g = { 3, 5, 9 };
		int[] s = { 1, 2, 4, 6, 8 };
		AssignCookies c = new AssignCookies();
		System.out.println(c.assignCookies(g, s));
	}

}
