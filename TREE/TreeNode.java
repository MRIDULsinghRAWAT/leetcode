
  //Definition for a binary tree node.
  public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
 
class Solution {
    int maxlength=0;// local variable niii hai 
    public int diameterOfBinaryTree(TreeNode root) {
//int maxlength=0;   -> wrong place bby 
height(root);
return maxlength;

    }
// ---------
private int height(TreeNode node){
    if(node== null) return 0;  
     // root==null mat likh kuiki iss qmie bola hai rrot ko count nah bhi kare to bhi chaaleag 


int left = height(node.left);
int right = height(node.right);

// updateeeeeeee hota raehga
maxlength= Math.max(maxlength,left+right);
return Math.max(left, right) + 1;
    }
}
// longest path btw any 2 nodes - diameter 
// max of right + max of left = diameter in short