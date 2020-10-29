package dailyCoding;

import java.util.ArrayList;

public class Day5 {
	
//	This problem was asked by Jane Street.
//	cons(a, b) constructs a pair, and car(pair) and cdr(pair) returns the first and last element of that pair. For example, car(cons(3, 4)) returns 3, and cdr(cons(3, 4)) returns 4.
//	Given this implementation of cons:
//	def cons(a, b):
//	    def pair(f):
//	        return f(a, b)
//	    return pair
//	Implement car and cdr.
	
	public static ArrayList<Integer> cons(int a, int b) {
		ArrayList<Integer> pair = new ArrayList<>();
		pair.add(0, a);
		pair.add(1, b);
		return pair;
	}
	
	public static int car(ArrayList<Integer> pair) {
		return pair.get(0);
	}
	
	public static int cdr(ArrayList<Integer> pair) {
		return pair.get(1);
	}

	public static void main(String[] args) {
		int a = 7;
		int b = 8;
		ArrayList<Integer> pair = cons(a, b);
		System.out.println(car(pair));
		System.out.println(cdr(pair));
	}
}
