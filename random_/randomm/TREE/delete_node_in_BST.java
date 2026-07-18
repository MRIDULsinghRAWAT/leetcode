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
    public TreeNode deleteNode(TreeNode root, int key) {

// manle node=3 remove krrna hai 
/**
fir delete krrne ke baad ek wapas se BST banega left mei chota aur right mei bada node rakh ke 

delete krrne ke baad jo left out node hai usse fix krrnahai _ NOTEBOOK MEI LIKHA HAI MAINE DIAGRAM KE SATH !
 
 
 Deletion has 3 main cases:

Node not found → just return root.
Node has no child (leaf) → simply delete the node (return null).
Node has one child → replace node with its child.
Node has two children →
Find the inorder successor (smallest node in right subtree).
Copy its value to current node.
Recursively delete the successor from right subtree.
 */

if (root==null) return null;

if(root.val>key) {  // key chota h to left mei jayenge
root.left=deleteNode(root.left,key);   ///recursively call 
// left subtrree mei jaake KEY  delete krrna 

} else if(root.val<key){  // bada h to right mei 
root.right=deleteNode(root.right,key);
}else{
    if(root.left==null) return root.right; // child nii hua to 
    if(root.right==null) return root.left;

// yeh case thora alag hai dekh le - 2 children - inorder SUCCESSOR

TreeNode bachaa  = findMinimum(root.right);   // right left mei se koi bhi ek likh sakhte h ... BST mei 
root.val=bachaa.val;
root.right=deleteNode(root.right,bachaa.val);

}

return root;
    }


// helper func ka use 
private TreeNode findMinimum(TreeNode node){
    while(node.left!=null){ // minimum ke liye h to left lia h 
        node=node.left;
    }
return node;

    }
}