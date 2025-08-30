public class min_depth_tree {
    
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
    public int minDepth(TreeNode root) {
        

                
if(root==null)return 0;

// recursively krre 
int leftdepth =minDepth(root.left);
int rightdepth =minDepth(root.right);

if(root.left ==null)return 1 + rightdepth;
if(root.right ==null)return 1 + leftdepth;


  // dono null to min
   return 1 + Math.min(leftdepth, rightdepth); 

//Answer = 1 + min(leftDepth, rightDepth)
//(1 add karte hain current node ke liye)
// 1 = root node 

    }
}