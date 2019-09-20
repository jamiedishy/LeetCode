package Easy;

import java.util.LinkedList;
import java.util.List;

public class DuplicateSortedList {

	static LinkedList<Integer> listInput = new LinkedList<Integer>();

	public static List<Integer> removeDuplicates(LinkedList<Integer> list1) {
		int beg = 0;
		while (beg < list1.size()) {
			if (list1.lastIndexOf(list1.get(beg)) != beg) {
				list1.remove(list1.lastIndexOf(list1.get(beg)));
			}
			else {
				beg++;
			}
		}
		return list1;
	}
	
	public static void main(String[] args) {
		listInput.add(1);
		listInput.add(2);
		listInput.add(2);
		listInput.add(2);
		listInput.add(3);
		listInput.add(3);

		System.out.println(removeDuplicates(listInput));
	}
}

//public ListNode deleteDuplicates(ListNode head) {
//    ListNode current = head;
//    while (current != null && current.next != null) {
//        if (current.next.val == current.val) {
//            current.next = current.next.next;
//        } else {
//            current = current.next;
//        }
//    }
//    return head;
//}
