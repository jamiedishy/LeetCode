package dailyCoding;

import java.util.Arrays;
import java.util.HashMap;

public class Day2b {
	
//	Given an array of integers, return a new array such that each element at index i of the new array is the product of all the numbers in the original array except the one at i.
//	For example, if our input was [1, 2, 3, 4, 5], the expected output would be [120, 60, 40, 30, 24]. If our input was [3, 2, 1], the expected output would be [2, 3, 6].
//  Follow-up: what if you can't use division?
	
	public static HashMap<Integer, Integer> jHashMap = new HashMap<>();
	public static HashMap<Integer, Integer> iHashMap = new HashMap<>();

	public static void populateJHashMap(int[] arr) { // O(N)
		int runningProd = 1;
		for (int j = arr.length - 1; j >= 0; j--) {
			runningProd *= arr[j]; 
			jHashMap.put(j, runningProd);
		}
	}
	
	public static int[] productArray(int[] arr) {
		int[] newProductArray = new int[arr.length];
		int runningProd = 1;
		
		populateJHashMap(arr);
		
		for (int i = 0; i < arr.length; i++) { // O(N)
			runningProd *= arr[i];
			iHashMap.put(i, runningProd);
			if (i == 0) {
				newProductArray[i] = jHashMap.get(i + 1);
			}
			else if (i == arr.length - 1) {
				newProductArray[i] = iHashMap.get(i - 1);
			}
			else {
			newProductArray[i] = jHashMap.get(i + 1) * iHashMap.get(i - 1);
			}
		}
		return newProductArray;
	}
	
	
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		// populateJHashMap(arr);
		System.out.println(Arrays.toString(productArray(arr)));
	}

}
