package dailyCoding;

public class Day8 {
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

	public boolean isUnivalTrees(Node node) {
		return univalHelper(node, node.data);
	}
	
	public boolean univalHelper(Node node, int data) { // check if every node in tree has same value
		if (node == null) {
			return true;
		}
		if (node.data == data) {
			return univalHelper(node.left, node.data) && univalHelper(node.right, node.data);
		}
		return false;
	}
	
	public int countUnivalSubTrees(Node node) {
		if (node == null) {
			return 0;
		}
		int left = countUnivalSubTrees(node.left);
		int right = countUnivalSubTrees(node.right);
		if (isUnivalTrees(node) == true) {
			return 1 + left + right;
		}
		return left + right;
	}
	
	public static void main(String[] args) {
		Node node = new Node(0);
		node.left = new Node(1);
		node.right = new Node(0);
		node.right.right = new Node(0);
		node.right.left = new Node(1);
		node.right.left.left = new Node(1);
		node.right.left.right = new Node(1);

		Day8 uTree = new Day8();
		System.out.println(uTree.countUnivalSubTrees(node));

	}

}
