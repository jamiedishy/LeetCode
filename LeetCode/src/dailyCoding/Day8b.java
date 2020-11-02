package dailyCoding;

public class Day8b {
//	This problem was asked by Google.
//	A unival tree (which stands for "universal value") is a tree where all nodes under it have the same value.
//	Given the root to a binary tree, count the number of unival subtrees.

	static class Node {
		Node left;
		Node right;
		int data;

		public Node(int data) {
			this.left = null;
			this.right = null;
			this.data = data;
		}
	}
	
	static class Count  
	{ 
	    int count = 0; 
	} 
	
	static Count count = new Count(); 
	
	public static boolean test(Node node, Count count) { // O(n) time O(n) space
		if (node == null) {
			return true;
		}
		
		boolean left = test(node.left, count);
		boolean right = test(node.right, count);
		
		if (left == false || right == false) {
			return false;
		}
		if (node.left != null && node.data != node.left.data) {
			return false;
		}
		if (node.right != null && node.data != node.right.data) {
			return false;
		}
		count.count++;
		return true;
	}
	
	public static int countUnivalTrees(Node node) {
		test(node, count);
		return count.count;
	}
	
	public static void main(String[] args) {
		Node node = new Node(0);
		node.left = new Node(1);
		node.right = new Node(0);
		node.right.right = new Node(0);
		node.right.left = new Node(1);
		node.right.left.left = new Node(1);
		node.right.left.right = new Node(1);
		System.out.println(countUnivalTrees(node));
	}

}
