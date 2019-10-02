package easy;

// I learned that an array has a set size, so if you must increase the size, then use an ArrayList
// ArrayLists are still easy to search through (constant time) and also can increase in size
// List = interface. ArrayList = Library
// When manipulating primitives, need to use math

import java.util.ArrayList;
import java.util.List;

public class ReverseInt {

	static int a = 1234;

	public static ArrayList<Integer> reverse(int a) {
		List<Integer> reverseList = new ArrayList<Integer>();
		while (a / 10 > 0) {
			reverseList.add(a % 10);
			a = a / 10;
			if (a / 10 == 0) {
				reverseList.add(a);
			}
		}
		return (ArrayList<Integer>) reverseList;
	}

	public static void main(String[] args) {
		System.out.println(reverse(a));

	}

}

//class Solution {
//    public int reverse(int x) {
//        int rev = 0;
//        while (x != 0) {
//            int pop = x % 10;
//            x /= 10;
//            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
//            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
//            rev = rev * 10 + pop;
//        }
//        return rev;
//    }
//}