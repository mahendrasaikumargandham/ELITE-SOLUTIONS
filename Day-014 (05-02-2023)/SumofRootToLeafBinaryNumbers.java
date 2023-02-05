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
    int traversal(TreeNode root, int sum) {
        if(root == null)
            return 0;
        
        sum = (2 * sum) + root.val;
        if(root.left == null && root.right == null)
            return sum;
        
        return traversal(root.left, sum) + traversal(root.right, sum);
    }
    public int sumRootToLeaf(TreeNode root) {
        return traversal(root, 0);
    }
}
