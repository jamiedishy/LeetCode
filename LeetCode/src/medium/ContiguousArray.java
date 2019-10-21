package medium;

import java.util.HashMap;

public class ContiguousArray {
	
	public static int maxSubarrayLength(int[] a) {
		int maxlen = 0;
		int count = 0;
		HashMap<Integer, Integer> map = new HashMap<>();
		
		map.put(0, -1);
		
		for (int i = 0; i < a.length; i++) {
			count = count + (a[i] == 1 ? 1 : -1);
			if (map.containsKey(count)) {
				maxlen = Math.max(maxlen, i-map.get(count));
			}
			else {
				map.put(count, i);
			}
		}
		return maxlen;
		
//		int zerosum = 0;
//		int onesum = 0;
//		int length = 0;
//		
//		for (int i = 0; i < a.length; i++) {
//			if (a[i] == 1) {
//				onesum++;
//			}
//			else if (a[i] == 0) {
//				zerosum++;
//			}
//			if (zerosum == onesum) {
//				length = onesum + zerosum;
//			}
//		}
//		return length;
	}

	public static void main(String[] args) {
		int[] nums = {0,0,1,0,0,0,1,1};
		System.out.println(maxSubarrayLength(nums));
	}
}
