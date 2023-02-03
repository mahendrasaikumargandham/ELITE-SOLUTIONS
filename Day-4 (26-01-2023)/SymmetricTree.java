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
    boolean symmetric(TreeNode root1, TreeNode root2) {
        if(root1 == null && root2 == null)
            return true;

        if((root1 != null && root2 == null) || (root1 == null && root2 != null)) 
            return false;
        
        if(root1.val != root2.val)
            return false;

        boolean left = symmetric(root1.left, root2.right);
        if(left == false) 
            return false;

        boolean right = symmetric(root1.right, root2.left);
        if(right == false)
            return false;
        return left && right;
    }

    public boolean isSymmetric(TreeNode root) {
        Solution instance = new Solution();
        boolean result = instance.symmetric(root, root);
        return result;
    }
}
