package HackerRank;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class TwitterUniqueUserId {

	static List<Integer> arr = new ArrayList<>();
	int beg = 0;
	int end = arr.size() - 1;

	private static List<Integer> sortArray(int beg, int end) {
		// base case
		if (end - beg + 1 == 2) {
			if (arr.get(beg) > arr.get(end)) {
				int placeholder = arr.get(beg);
				arr.set(beg, arr.get(end));
				arr.set(end, placeholder);
			}
		}

		else if (end - beg + 1 > 2) {
			int pivot = arr.get(end);
			int pointer = beg - 1;
			for (int j = beg; j <= end; j++) {
				if (arr.get(j) < pivot) {
					pointer++;
					int placeholder = arr.get(pointer);
					arr.set(pointer, arr.get(j));
					arr.set(j, placeholder);
				} else if (arr.get(j) == pivot) {
					arr.set(j, arr.get(pointer + 1));
					arr.set(pointer + 1, pivot);
				}
			}
			sortArray(beg, pointer);
			sortArray(pointer + 2, end);
		}

		return arr;
	}

	public static int getUserIdSum(List<Integer> arr) {
		int sum = 0;
		int[] arr2 = new int[2000];
		int pointer = 0;

		for (int i = 0; i < arr.size(); i++) {
			if (arr2[arr.get(i)] == 1) {
				arr2[pointer] = 1;
				sum += pointer;
				pointer++;
			} else {
				arr2[arr.get(i)] = 1;
				pointer = arr.get(i) + 1;
				sum += arr.get(i);
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		arr.add(4);
		arr.add(2);
		arr.add(1);
		arr.add(2);
		arr.add(5);
		arr.add(2);
		System.out.println(sortArray(0, arr.size() - 1));
		System.out.println(getUserIdSum(arr));
	}
}


//public static int uniqueIdSum(int[] a) {
//	int sum = 0;
//	int valueCount = 1;
//	
//	List<Integer> arr = new ArrayList<>();
//	
//	arr.
	
//	HashMap<Integer, Integer> map = new HashMap<>();
//	for (int i = 0; i < a.length; i++) {
//		if (map.containsKey(a[i])) {
//			valueCount = map.get(a[i]) + 1;
//			map.put(a[i], valueCount);
//		} else {
//			map.put(a[i], 1);
//		}
//	}
//	
//	Iterator iterator = map.keySet().iterator();
//	while (iterator.hasNext()) {
//		int count = 1;
//		System.out.println(map.get((Integer)iterator.next()));
//		
//		if (map.get(iterator.next()) == 1) {
//		sum += (Integer) iterator.next();
//		}
//		else {
//			while (map.get((Integer)iterator.next()) > 1) {
//				//System.out.println((map.get((Integer)iterator.next())));
//				if (!map.containsKey((Integer)iterator.next()+count)) {
//					map.put((Integer)iterator.next()+count, 1);
//					map.replace((Integer)iterator.next(), map.get((Integer)iterator.next()), map.get((Integer)iterator.next())-1);
//				    count++;
//				}
//				else if (map.containsKey((Integer)iterator.next()+count)) {
//				    count++;
//				}
//			}
//		}
//	}
//	while (iterator.hasNext()) {
//		sum += (Integer) iterator.next();
//	}

//  HashMap<Integer, Integer> map = new HashMap<>();
//	for (int i = 0; i < a.length; i++) {
//		if (map.containsKey(a[i])) {
//			map.put(a[i], valueCount += 1);
//		} else {
//			map.put(a[i], 1);
//		}
//	}
//	// System.out.println(map.keySet().toString());
//	// System.out.println(map.values().toString());
//	int helper = 0;
//	Iterator iterator = map.keySet().iterator();
//	while (iterator.hasNext()) {
//		// System.out.println(map.get((Integer) iterator.next()));
//		if (map.get((Integer) iterator.next()) > 1) {
////			map.replace((Integer) iterator.next(), map.get((Integer) iterator.next()),
////					map.get((Integer) iterator.next()) - 1);
//			while (map.containsKey((Integer) iterator.next())) {
//				helper = (Integer) iterator.next() + 1;
//			}
//			if (!map.containsKey(helper)) {
//				map.put(helper, 1);
//			}
//			sum += (Integer) iterator.next();
//		} else if (map.get((Integer) iterator.next()) == 1) {
//			//System.out.println("hello");
//			sum += (Integer) iterator.next();
//		}
//	}
//	return sum;
//}
