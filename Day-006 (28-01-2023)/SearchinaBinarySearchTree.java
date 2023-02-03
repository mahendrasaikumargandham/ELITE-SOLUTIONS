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
    public TreeNode searchBST(TreeNode root, int val) {
        if(root == null)
            return null;
        
        TreeNode curr = root;
        while(curr.val != val) {
            if(curr.val > val)
                curr = curr.left;
            else
                curr = curr.right;

            if(curr == null)
                return null;
        }
        return curr;
    }
}
