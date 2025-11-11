package TREE;
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
     // sirf ismei root include ka seen h
   // leetcode 543 jaisa h same ---
    int maxsum=Integer.MIN_VALUE;                    // LOGIC SPOT ON ( EK CATCH HAI BSS ( -VE VALUE KE LIYE ))
    public int maxPathSum(TreeNode root) {
      height(root);
return maxsum;

    }
private int height(TreeNode root){
    if(root== null) return 0;   //

int left = Math.max(0,height(root.left));
int right = Math.max(0,height(root.right));

maxsum = Math.max(maxsum,root.val+left+right);
return root.val + Math.max(left, right) ;
    }
}  
    