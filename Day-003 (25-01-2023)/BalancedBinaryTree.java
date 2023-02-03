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
    boolean flag = true;
    int height(TreeNode root) {
        if(root == null)
            return 0;
        
        int left = height(root.right);
        int right = height(root.left);

        if(Math.abs(left - right) > 1) {
            flag = false;
            System.out.println(flag + " changed");
        }
        return Math.max(left, right) + 1;
    }
    public boolean isBalanced(TreeNode root) {
        if(root == null)
            return true;
        Solution instance = new Solution();
        instance.height(root);
        return instance.flag;
    }
}
