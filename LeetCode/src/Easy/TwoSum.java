package Easy;

import java.util.Arrays;

public class TwoSum {
	
	static int[] array1 = {2, 3, 7, 11, 15};
	static int target = 9; // target value
	
	public static int[] subArray(int[] array1) {
		int[] array2 = {};
		
		for (int i = 0; i < array1.length; i++) {
			if (array1[i] > target) {
				array2 = Arrays.copyOf(array1, i-1); // [2, 3, 7]
			//	System.out.println(Arrays.toString(array2));
			}
			else {
				array2 = Arrays.copyOf(array1, array1.length);
			}
		}
		// System.out.println(Arrays.toString(array2)); --> [2, 3, 7]
		for (int i = 0; i < array2.length; i++) {
			int j = array2.length-1;
			if (array2[i] + array2[j] > target) {
				j--;
			}
			else if (array2[i] + array2[j] < target) {
				i++;
			}
			else {
				int[] array3 = {i, j};
				System.out.println(Arrays.toString(array3)); // [0, 2]! Works! 
			}
		}
		return array2;
	}
	
	
	public static void main(String[] args) {
		System.out.println(subArray(array1));
	}
}
