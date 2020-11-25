package easy;

//import java.util.*;

public class SingleNumber {

//	public int findSingleNumber(int[] arr) { // o(n) time and guaranteed less than o(n) space but still not constant
////		HashMap<Integer, Integer> map = new HashMap<>();
//		HashSet<Integer> set = new HashSet<>();
//		for (int i = 0; i < arr.length; i++) {
//			if (!set.contains(arr[i])) {
//				set.add(arr[i]);
//			} else {
//				set.remove(arr[i]);
//			}
//		}
//		Iterator it = set.iterator();
//		return (int) it.next();
//	}

	public int findSingleNumber(int[] nums) {
		int a = 0;
		for (int i : nums) {
			System.out.println(a);
			a ^= i;
		}
		return a;
	}

	public static void main(String[] args) {
		int[] arr = { 0, 0, 1, 3, 5, 1, 5, 3, 7, 9, 8, 8, 9 };
		SingleNumber c = new SingleNumber();
		System.out.println(c.findSingleNumber(arr));
	}

}
