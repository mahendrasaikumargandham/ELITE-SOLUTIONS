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
    int sum = 0;
    void change(TreeNode root) {
        if(root == null)
            return;
        
        change(root.right);
        sum = sum + root.val;
        root.val = sum;
        change(root.left);
    }
    public TreeNode bstToGst(TreeNode root) {
        if(root == null)
            return null;

        change(root);
        return root;
    }
}
