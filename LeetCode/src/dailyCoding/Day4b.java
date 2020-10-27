package dailyCoding;

import java.util.HashMap;

public class Day4b {

//  This problem was asked by Stripe.
//	Given an array of integers, find the first missing positive integer in linear time and constant space. In other words, find the lowest positive integer that does not exist in the array. The array can contain duplicates and negative numbers as well.
//	For example, the input [3, 4, -1, 1] should give 2. The input [1, 2, 0] should give 3.
//	You can modify the input array in-place.
//  Since the first missing positive number must be between 1 and len(array) + 1 (why?), we can ignore any negative numbers and numbers bigger than len(array). T
	
	public static HashMap<Integer, Integer> populateMap(int[] arr) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			map.put(i, arr[i]);
		}
		return map;
	}

	public static int smallestMissingInt(int[] arr) { // O(n) time and space
		int smallestMissingInt = 0;
		HashMap<Integer, Integer> map = populateMap(arr);
		
		for (int i = 1; i < arr.length; i++) {
			if (!map.containsValue(i)) {
				smallestMissingInt = i;
				return smallestMissingInt;
			}
		}
		smallestMissingInt = arr.length + 1;
		return smallestMissingInt;

	}

	public static void main(String[] args) {
		int[] arr = { -5, -100, 1, 2, 3, 4 };
		System.out.println(smallestMissingInt(arr));
	}

}
