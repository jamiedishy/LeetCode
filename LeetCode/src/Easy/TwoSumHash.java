package Easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumHash {
	
	static int[] sample = {2, 3, 7, 11, 15};
	
	public static int[] twoSum(int[] num, int target) {
	    Map<Integer, Integer> map = new HashMap<>();
	    for (int i = 0; i < num.length; i++) {
	    	map.put(num[i], i);
	    }
	    for (int i = 0; i < num.length; i++) {
	    	int complement = target - num[i];
	    	if (map.containsKey(complement) && map.get(complement) != i) { // can't add a value twice
	    		return new int[] {i, map.get(complement)};
	    	}
	    }
		throw new IllegalArgumentException("two numbers dont add up!");
	}

public static void main (String[] args) {
	System.out.println(Arrays.toString(twoSum(sample, 9)));
	
}

}
