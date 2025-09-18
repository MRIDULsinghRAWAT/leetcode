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
class solution{
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
         if(root ==null) return false;  //
if (sametree(root,subRoot)) return true;
return isSubtree(root.left,subRoot) || isSubtree (root.right,subRoot);
    }
    
// recursion bc kya cheez h 
        private boolean sametree(TreeNode a,TreeNode b){
        if(a ==null && b==null) return true;
        if(a ==null || b==null) return false;
        if(a.val!=b.val) return false;
        return sametree(a.left,b.left) && sametree(a.right,b.right);
        // same h ki ni wo check krrke return 
    }

}