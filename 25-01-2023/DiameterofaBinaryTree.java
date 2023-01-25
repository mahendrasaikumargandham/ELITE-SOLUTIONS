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

    int max = 0;

    int height(TreeNode root) {
        if(root == null)
            return 0;
        
        int left = height(root.left);
        int right = height(root.right);

        if(max < left + right + 1)
            max = left + right;

        return Math.max(left, right) + 1;
    }
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null)
            return 0;

        height(root);
        return max;
    }
}
