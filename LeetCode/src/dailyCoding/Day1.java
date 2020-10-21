package dailyCoding;

import java.util.HashMap;

public class Day1 {
	
	// O(N) time O(N) space
	public static Boolean checkSum(int[] arr, int k) {
		HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();
		for (int i = 0; i < arr.length; i++) {
			hmap.put(i, arr[i]);
		}
		for (int i = 0; i < arr.length; i++) {
			if (hmap.containsValue(k - arr[i])) {
				return true;
			}
		}
		return false;
	}
	
	

	public static void main(String[] args) {
		int[] array = {10, 15, 3, 7};
		System.out.println(checkSum(array, 7));
	}

}
