package easy;

public class SubTree {

	public static class Node {
		int val;
		Node left;
		Node right;

		public Node(int val) {
			this.val = val;
		}
	}

	public static boolean isSubtree(Node s, Node t) {
		if (s == null && t == null) {
			return true;
		}
		if (s == null || t == null) {
			return false;
		}
		if (s.val == t.val) {
			return isSubtree(s.left, t.left) && isSubtree(s.right, t.right);
		}
		return isSubtree(s.left, t) || isSubtree(s.right, t);
	}

	public static void main(String[] args) {
		Node s = new Node(1);
		s.left = new Node(2);
		s.right = new Node(3);
		s.left.left = new Node(4);
		s.left.right = new Node(5);
		s.right = new Node(3);

		Node t = new Node(2);
		t.left = new Node(4);
		t.right = new Node(9);

		System.out.println(isSubtree(s, t));

	}

}
