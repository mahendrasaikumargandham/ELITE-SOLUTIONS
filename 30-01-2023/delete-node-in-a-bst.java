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
    int successor(TreeNode root) {
        int temp = root.val;
        while(root.left != null) {
            temp = root.left.val;
            root = root.left;
        }
        return temp;
    }
  
    public TreeNode deleteNode(TreeNode root, int val) {
        if(root == null)
            return null;

        if(root.val > val)
            root.left = deleteNode(root.left, val);
        else if(root.val < val)
            root.right = deleteNode(root.right, val);
        
        else {
            if(root.left == null)
                return root.right;
            if(root.right == null)
                return root.left;
            
            root.val = successor(root.right);
            root.right = deleteNode(root.right, root.val);    
        }
        return root;
    }
}
