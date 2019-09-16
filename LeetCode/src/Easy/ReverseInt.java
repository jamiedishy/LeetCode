package Easy;

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
			reverseList.add(a%10);
			a = a / 10;
			if (a == 1) {
				reverseList.add(a);
			}
		}
		return (ArrayList<Integer>) reverseList;
	}

	
	public static void main(String[] args) {
	 System.out.println(reverse(a));
	}

}
