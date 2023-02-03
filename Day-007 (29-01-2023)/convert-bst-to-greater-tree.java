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
    void greaterRoot(TreeNode root) {
        if(root == null)
            return;
        
        greaterRoot(root.right);
        sum = sum + root.val;
        root.val = sum;
        greaterRoot(root.left);
    }
    public TreeNode convertBST(TreeNode root) {
        Solution instance = new Solution();
        instance.greaterRoot(root);
        
        return root;
    }
}
