package TREE;
public class balanced_tree {
    
}
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
    public boolean isBalanced(TreeNode root) {

// DFS - DEPTH FIRST SEARCH 
// USE HOGA 
/**
Idea simple hai:
"Pehle depth me jao, jitna andar tak jaa sakte ho jao, uske baad backtrack karke baaki explore karo."
 

 Start 1 → Go Left 2 → Go Left 4 → Back → Right 5 → Back → Back to 1 → Right 3
 
 */

return DfsHeight(root) != -1;
    }
private int DfsHeight(TreeNode node){
if(node ==null)return 0;
int left =DfsHeight(node.left);
if(left== -1) return -1;  // -1 ka mtlb imbalance 
int right=DfsHeight(node.right);
if(right== -1) return -1;

// absolute function ka use krrte hai -ve bhi positive dega 
if (Math.abs(left - right) > 1) return -1;

return 1+Math.max(left,right);

    }
}