package easy;

public class TreeTraversalMaxDepth {
	
	/**
	 * Definition for a binary tree node.
	 * public class TreeNode {
	 *     int val;
	 *     TreeNode left;
	 *     TreeNode right;
	 *     TreeNode() {}
	 *     TreeNode(int val) { this.val = val; }
	 *     TreeNode(int val, TreeNode left, TreeNode right) {
	 *         this.val = val;
	 *         this.left = left;
	 *         this.right = right;
	 *     }
	 * }
	 */
	    private int maxDepth = 0;
	    public int maxDepth(TreeNode root) {
	        mDepth(root, 0);
	        return maxDepth;
	    }
	    public void mDepth(TreeNode root, int depth) {
	        if (root != null) {
	            depth++;
	            maxDepth = maxDepth >= depth? maxDepth : depth;
	            mDepth(root.right, depth);
	            mDepth(root.left, depth);
	        }
	    }
}
