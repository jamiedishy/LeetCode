package medium;

import java.util.Arrays;

public class MaxSumSubArray {

	public static int[] maxSubArray(int[] x) {
		int solsum = 0;
		int suffixsum = 0;	
		int k = 0;
		int i = 0;
		int j = 0;
		
		for (int t = 0; t < x.length-1; t++) {
			if (suffixsum + x[t] > 0) {
				suffixsum += x[t];
			}
			else {
				suffixsum = 0;
				k = t;
			}
			if (solsum < suffixsum) {
				solsum = suffixsum;
				i = k;
				j = t+1;
			}
		}
		
		int[] bestsolution = Arrays.copyOfRange(x, i+1, j);
		return bestsolution;
	}
	
	public static void main(String[] args) {
		int[] a = {2, 1, -6, -3, 2, -4, 6, -2, -1, 1, 3, -4, 7, -5, 2, -3};
		System.out.println(Arrays.toString(maxSubArray(a)));
	}
}
