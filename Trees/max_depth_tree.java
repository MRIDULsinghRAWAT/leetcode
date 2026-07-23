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
class Solution {
    public int maxDepth(TreeNode root) {
        // this is dfs approach 
        // use base case 
        // the find  max depth of left and right
        //return max depth of (which ever left or right which is max) + root (1);
        if (root == null)
            return 0;
        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);// int mei isisliye kuin depth integer mei hoga 
        return 1 + Math.max(leftDepth, rightDepth);
    }
}

