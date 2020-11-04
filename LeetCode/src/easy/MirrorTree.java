package easy;


public class MirrorTree {
	
	static class BinaryTree {
		BinaryTree right;
		BinaryTree left;
		int data;
		
		public BinaryTree(int data) {
			this.right = null;
			this.left = null;
			this.data = data;
		}
	}
	
	public static boolean isMirror(BinaryTree node) {
		if (node.left != null && node.right != null) {
		return mirrorHelper(node.left, node.right);
		}
		else if (node.left != null || node.right != null){ // unevenly balanced
			return false;
		}
		return true; // if only one node
	}
	
	public static boolean mirrorHelper(BinaryTree left, BinaryTree right) {
		
		if (left.left == null && left.right == null && right.left == null && right.right == null) {
			if (left.data == right.data) {
				return true;
			} 
			else {
				return false;
			}
		}
		else if (left.left == null || left.right == null || right.left == null || right.right == null) {
			return false;
		}
		return mirrorHelper(left.left, right.right) && mirrorHelper(left.right, right.left); 
	}

	public static void main(String[] args) {
		BinaryTree node = new BinaryTree(1);
		node.left = new BinaryTree(2);
		node.right = new BinaryTree(2);
		node.left.left = new BinaryTree(3);
		node.left.right = new BinaryTree(4);
		node.right.left = new BinaryTree(4);
		node.right.right = new BinaryTree(3);
		
		System.out.println(isMirror(node));
	}

}
