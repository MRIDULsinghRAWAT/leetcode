import java.util.ArrayList;
import java.util.List;

import javax.swing.tree.TreeNode;

public /**
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
    public List<Integer> postorderTraversal(TreeNode root) {
      List<Integer> result = new ArrayList<>(); // yeh imp hai li,ha humme iss method se krrne ke liye 
if(root==null)return result;   

  
result.addAll(postorderTraversal(root.left));
result.addAll(postorderTraversal(root.right));
result.add(root.val); 
return result ;    
    }
} {
    
}
