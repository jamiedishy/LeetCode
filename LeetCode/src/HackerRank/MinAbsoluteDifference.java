package HackerRank;

import java.util.Arrays;

public class MinAbsoluteDifference {
	
	public static int minAbsDiff(int[] A) {
		int finalMin = Integer.MAX_VALUE;
		int curMin = Integer.MAX_VALUE;
		
		// Sorting
		Arrays.sort(A);
	
		// Greedy part of algorithm
		for (int i = 0; i < A.length-1; i++) {
			curMin = Math.abs((A[i] - A[i+1]));
			if (curMin < finalMin) {
				finalMin = curMin;
			}
			if (finalMin == 1) {
				return finalMin;
			}
		}
		return finalMin;
	}
	
	
	public static void main(String[] args) {
		int[] Arr = {-59, -36, -13, 1, -53, -92, -2, -96, -54, 75};
		System.out.println(minAbsDiff(Arr));
	}

}
