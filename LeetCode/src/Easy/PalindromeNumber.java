package Easy;
// handle the obvious cases, if < 10 or if negative
// convert the iteger into an arraylist that has reverse order
// use arraylist to get an int with opposite order values as input
// compare the newly created int with the input... if the same, true, if not, false
// i needed to initialize an int to equal the input value of x since the forloop modifies the value of x later on
// this is inefficient though, it's O(n) time and takes up a bunch of space since I create an array list plus I initialize a bunch of variables
// the second way, i still need to convert the int into a string though to find how many digits it contains... inefficient?
// i learned that it is very easy to convert an int into a string... don't always need to create an arraylist

//import java.util.ArrayList;
//import java.util.List;

public class PalindromeNumber {
	
	public static boolean paldrome(int x) {
//		int a = x;
//		if (x < 10 && x >= 0) {
//			return true;
//		}
//		if (x < 0) {
//			return false;
//		}
//		List<Integer> arlist = new ArrayList<Integer>();
//		while (x / 10 >= 1) {
//			arlist.add(x%10);
//			x = x / 10;
//		}
//		if (x/10 < 1) {
//			arlist.add(x%10);
//		}
//		int b = 0;
//		for (int i = 0; i < arlist.size(); i++) {
//			b = (b * 10) + arlist.get(i);
//		}
////		System.out.println(b);
////		System.out.println(a);
//		if (b != a) {
//			return false;
//		}
//		else {
//			return true;
//		}
		int a = x;
		if (x < 0) {
			return false;
		}
		
		int reverse = 0;
		while (x > reverse) {
			reverse = (reverse * 10) + x % 10;
			x /= 10;
		}
		System.out.println(reverse);
		if (Integer.toString(a).length() %2 == 0) {
			if ( x == reverse ) {
				return true;
			}
		}
		else if (Integer.toString(a).length() %2 != 0) {
			if (x == reverse/10) {
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		System.out.println(paldrome(122221));
		
	}
	
	
}
