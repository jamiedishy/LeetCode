package medium;

public class ValidateBinarySearchTree {

	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		public TreeNode() {
		}

		public TreeNode(int val) {
			this.val = val;
		}

		public TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}

	public static boolean isValidBST(TreeNode root) {
		if (root.left == null && root.right == null) { // if it's a leaf
			return true;
		}
		if (root.left == null && root.right != null) {
			if (root.right.val > root.val) {
				return true;
			} else {
				return false;
			}
		}
		if (root.left != null && root.right == null) {
			if (root.left.val < root.val) {
				return true;
			} else {
				return false;
			}
		}
		if (root.right.val < root.val) {
			System.out.println("hi");
			return false;
		}
		if (root.left.val > root.val) {
			return false;
		}
		return isValidBST(root.left) && isValidBST(root.right);
	}
	
//	class Solution {
//		  public boolean helper(TreeNode node, Integer lower, Integer upper) {
//		    if (node == null) return true;
//
//		    int val = node.val;
//		    if (lower != null && val <= lower) return false;
//		    if (upper != null && val >= upper) return false;
//
//		    if (! helper(node.right, val, upper)) return false;
//		    if (! helper(node.left, lower, val)) return false;
//		    return true;
//		  }
//
//		  public boolean isValidBST(TreeNode root) {
//		    return helper(root, null, null);
//		  }
//		}
	
	public static void main(String[] args) {
		TreeNode node = new TreeNode(5);
		node.left = new TreeNode(1);
		node.right = new TreeNode(4);
		node.right.left = new TreeNode(3);
		node.right.right = new TreeNode(6);
		node.right.right.right = new TreeNode(7);
		System.out.println(isValidBST(node));
	}
}
