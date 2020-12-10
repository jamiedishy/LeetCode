package easy;

import java.util.*;

public class LastStoneWeight {

// PSEUDOCODE WITH MAXHEAP:
//	public int stoneweight(int[] stones) {
//		create a heap 
//		add elements from stones array into the heap, so that the root of the heap is the max weight // o(n)
//		while (heap.size > 1) {
//			int y = heap.root // o(logn)
//			int x = heap.root // second heaviest, o(logn)
//			remove y from heap, remove x from heap // o(logn) twice
//			if (x != y) {
//				heap.add(y-x)
//		}
//
//		if heap is empty, return 0
//		else, return heap.root
//	}

	public int listGetMax(List<Integer> list) { // returns the max and removes it from the list
		int index = list.indexOf(Collections.max(list));
		int result = list.get(index);
		list.remove(index);
		return result;
	}
	
	public int lastStoneWeightList(int[] stones) { // o(n^2)
		ArrayList<Integer> list = new ArrayList<>();

		for (int i = 0; i < stones.length; i++) { // o(n)
			list.add(stones[i]);
		}

		while (list.size() > 1) { // o(n-1)
			int y = listGetMax(list); // o(n)
			int x = listGetMax(list); // o(n)
			if (x != y) {
				list.add(y - x);
			} 
		}

		if (list.size() > 0) {
			return list.get(0);
		}
		return 0;
	}
	
	public int lastStoneWeightMaxHeap(int[] stones) { // o (nlogn)
		PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder()); // in java, this is by default a min heap
		
		for (int weight: stones) {
			maxHeap.add(weight);
		}
		
		while (maxHeap.size() > 1) { // o(n-1)
			int y = maxHeap.remove(); // heaviest, o(logn)
			int x = maxHeap.remove(); // second heaviest, o(logn)
			if (x != y) {
				maxHeap.add(y-x);
			}
		}
		return maxHeap.size() > 0 ? maxHeap.remove() : 0;
	}

}
