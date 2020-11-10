package dailyCoding;

import java.util.LinkedList;
import java.util.ListIterator;

public class Day20 {
//	This problem was asked by Google.
//	Given two singly linked lists that intersect at some point, find the intersecting node. The lists are non-cyclical.
//	For example, given A = 3 -> 7 -> 8 -> 10 and B = 99 -> 1 -> 8 -> 10, return the node with value 8.
//	In this example, assume nodes with the same value are the exact same node objects.
//	Do this in O(M + N) time (where M and N are the lengths of the lists) and constant space.

	public static int intersectingNode(LinkedList<Integer> A, LinkedList<Integer> B) { // O(M+N), o(1) space
		int sizeA = A.size();
		int sizeB = B.size();
		int startingNode = 0;
		ListIterator<Integer> listIteratorA = A.listIterator();
		ListIterator<Integer> listIteratorB = B.listIterator();

		if (sizeA > sizeB) {
			startingNode = sizeA - sizeB;
			listIteratorA = A.listIterator(startingNode);
		} else if (sizeB > sizeA) {
			startingNode = sizeB - sizeA;
			listIteratorB = B.listIterator(startingNode);
		}

		int a = listIteratorA.next();
		int b = listIteratorB.next();

		while (a != b) {
			a = listIteratorA.next();
			b = listIteratorB.next();
		}

		return a;
	}

	public static void main(String[] args) {
		LinkedList<Integer> listA = new LinkedList<>();
		listA.add(33);
		listA.add(13);
		listA.add(300);
		listA.add(3);
		listA.add(7);
		listA.add(8);
		listA.add(10);
		LinkedList<Integer> listB = new LinkedList<>();
		listB.add(3);
		listB.add(7);
		listB.add(8);
		listB.add(10);
		System.out.println(intersectingNode(listA, listB));
	}

}
