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
    public List<Integer> inorderTraversal(TreeNode root) {

     // ------------   
      List<Integer> result = new ArrayList<>();
       
if(root==null){
    return result;   //fallback se shuruwat
}
// easy tbh

result.addAll(inorderTraversal(root.left));
// left ko lete hai 
result.add(root.val);    
 // root mei chale gye (mid mei mtlb)
result.addAll(inorderTraversal(root.right));
 // last mei right mei chal diye
return result ;  

    }
}