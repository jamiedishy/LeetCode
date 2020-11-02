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

	public int univalTrees(Node node) {
		if (node.left == null && node.right == null) {
			System.out.println("leaf" + node.data);
			return 1;
		} 
		else if (node.right.data == node.data && node.left.data == node.data) {
			System.out.println("tree" + node.data);
			return 1 + univalTrees(node.left) + univalTrees(node.right);
		} 
		else {
			return univalTrees(node.left) + univalTrees(node.right);
		}
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
		System.out.println(uTree.univalTrees(node));

	}

}
