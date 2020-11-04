package easy;

public class TreeTraversalMaxDepth {
	static class Node {
		Node right;
		Node left;
		int data;
		public Node(int data) {
			this.right = null;
			this.left = null;
			this.data = data;
		}
	}
	
	public static int maxDepth(Node node) {
		
		if (node == null) {
			return 0;
		}
		
		return 1 + Math.max(maxDepth(node.left), maxDepth(node.right));
	}
	
	
	
	public static void main(String[] args) {
		Node node = new Node(3);
		node.left = new Node(9);
		node.right = new Node(20);
		node.right.left = new Node(15);
		node.right.right = new Node(7);
		node.right.left.left = new Node(4);
		
		System.out.println(maxDepth(node));
	}
	
}
