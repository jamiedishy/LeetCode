package dailyCoding;

import java.util.Arrays;

public class Day4 {

//  This problem was asked by Stripe.
//	Given an array of integers, find the first missing positive integer in linear time and constant space. In other words, find the lowest positive integer that does not exist in the array. The array can contain duplicates and negative numbers as well.
//	For example, the input [3, 4, -1, 1] should give 2. The input [1, 2, 0] should give 3.
//	You can modify the input array in-place.

	public static int smallestMissingInt(int[] arr) { // O(nlogn)
		int smallestMissingInt = 0;
		int i = 0;
		int j = i + 1;
		int firstNonNegative = 0;

		Arrays.sort(arr); // O(NlogN)

		while (j < arr.length) {
			if (arr[i] < 1) {
				i++;
				j++;
			} else if (arr[i] + 1 == arr[j]) {
				firstNonNegative = i;
				i++;
				j++;
			} else if (arr[i] + 1 != arr[j]) {
				smallestMissingInt = arr[i] + 1;
				return smallestMissingInt;
			}
			if (arr[firstNonNegative] != 1) {
				return 1;
			}
		}
		if (smallestMissingInt == 0) {
			if (arr[arr.length - 1] > 0) {
				return arr[arr.length - 1] + 1;
			} else {
				return 1;
			}
		}
		return smallestMissingInt;
	}

	public static void main(String[] args) {
		int[] arr = { -5, -100, 1 };
		System.out.println(smallestMissingInt(arr));
	}

}
