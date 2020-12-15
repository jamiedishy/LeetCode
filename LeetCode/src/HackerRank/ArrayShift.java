package HackerRank;

import java.util.Arrays;

public class ArrayShift {
	
	public static int[] shiftArray(int[] arr, int val) {
		if (arr.length < 1) {
			return arr;
		}
		int shift = val < 0 ? (val * -1) % arr.length : val % arr.length;

		int prev = 0;
		
		for (int i = 0; i < shift; i++) {
			for (int j = 0; j < arr.length; j++) {
				int temp = arr[j];
				arr[j] = prev;
				prev = temp;
				if (j == 0) {
					arr[j] = arr[arr.length - 1]; 
				}
			}
			System.out.println(Arrays.toString(arr));
		}
		
		return arr;
	}
	
	
	public static void main(String[] args) {
		int[] arr = {2, 4, 6, 9, 11};
		System.out.println(Arrays.toString(shiftArray(arr, 8)));
	}

}
