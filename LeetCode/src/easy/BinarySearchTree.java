package easy;

import easy.TreeTraversalMaxDepth.Node;

public class BinarySearchTree {

	public static TreeTraversalMaxDepth.Node searchTree(TreeTraversalMaxDepth.Node node, int val) {
		if (node == null) {
			return null;
		}
		if (node.data == val) {
			System.out.println(node.data);
			return node;
		}
		if (node.data > val) {
			return searchTree(node.left, val);
		}
		return searchTree(node.right, val);

	}

	public static void main(String[] args) {
		TreeTraversalMaxDepth.Node node = new TreeTraversalMaxDepth.Node(3);
		node.left = new Node(9);
		node.right = new Node(20);
		node.right.left = new Node(15);
		node.right.right = new Node(7);
		node.right.left.left = new Node(4);

		System.out.println(searchTree(node, 15));
	}

}
