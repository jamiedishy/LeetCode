package dailyCoding;

import java.util.Arrays;

public class Day2 {
	
//	Given an array of integers, return a new array such that each element at index i of the new array is the product of all the numbers in the original array except the one at i.
//	For example, if our input was [1, 2, 3, 4, 5], the expected output would be [120, 60, 40, 30, 24]. If our input was [3, 2, 1], the expected output would be [2, 3, 6].

	public static int getTotalProduct(int[] arr) {
		int product = 1;
		for (int i = 0; i < arr.length; i++) {
			product *= arr[i];
		}
		return product;
	}
	
	public static int[] productArray(int[] arr) {
		int[] newProductArray = new int[arr.length];
		int product = getTotalProduct(arr);
		for (int i = 0; i < arr.length; i++) {
			newProductArray[i] = product / arr[i];
		}
		return newProductArray;
	}
	
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		System.out.println(Arrays.toString(productArray(arr)));
		
	}

}

