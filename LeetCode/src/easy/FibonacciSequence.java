package easy;

public class FibonacciSequence {
	
	static int[] A = new int[50];
	public static int fib(int n) {
		int f = 0;
		if (n < 2) {
			return n;
		}
		if (A[n] != 0) {
			return A[n];
		}
		else {
		f = fib(n-1) + fib(n-2);
		}

		return f;
	}
	
	public static void main(String[] args) {
		System.out.println(fib(5));
	}
	

}
