package easy;

public class MergeSortedLists {
	 
	 public static class ListNode {
		 int val;
		 ListNode next;
		 ListNode(int val) {
			 this.val = val;
		 }
	 }
	 
	 public static ListNode mergeLists(ListNode l1, ListNode l2) {
		 ListNode prevNode = new ListNode(-1);
		 ListNode prev = prevNode; // pointer that can increment and update the list prevNode
		 
		 while (l1 != null && l2 != null) {
			 if (l1.val <= l2.val) {
				 prev.next = l1;
				 l1 = l1.next;
			 }
			 else {
				 prev.next = l2;
				 l2 = l2.next;
			 }
			 prev = prev.next; // increment the pointer
		 }
		 
		 prev.next = l1 == null? l2 : l1;
		 
		 return prevNode.next;
	 }
	 
	 public static void main(String[] args) {
		 ListNode l1 = new ListNode(1);
		 l1.next = new ListNode(4);
		 l1.next.next = new ListNode(5);
		 
		 ListNode l2 = new ListNode(2);
		 l2.next = new ListNode(6);
		 
		 ListNode result = mergeLists(l1, l2);
		 
		 while (result != null) {
			 System.out.println(result.val);
			 result = result.next;
		 }
	 }

}
