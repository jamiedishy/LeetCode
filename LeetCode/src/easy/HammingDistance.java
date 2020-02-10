package easy;

public class HammingDistance {

	public static int hammingDistance(int x, int y) {	
		return Integer.bitCount(x ^ y);
	}
	
	public static void main(String[] args) {
		int a = 6;
		int b = 3;
		System.out.println(hammingDistance(a, b));
	}
}
