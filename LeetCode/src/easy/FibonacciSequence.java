package easy;

import java.util.HashMap;

public class FibonacciSequence {
	
	public static HashMap<Integer, Integer> memoMap = new HashMap<>();
	
	// max n is 46 otherwise overflow of java's signed 32-bit ints
	public static int fib(int n) {
		if (n <= 1) {
			memoMap.put(n, n);
			return n;
		}
		if (memoMap.containsKey(n)) {
			return memoMap.get(n);
		}
		
		int value = fib(n-1) + fib(n-2);
		memoMap.put(n, value);
		
		return memoMap.get(n);
	}
	
	public static void main(String[] args) {
		System.out.println(fib(46));
		
//		for (int val : memoMap.keySet()) {
//			System.out.println(val);
//		}
	}
	

}
