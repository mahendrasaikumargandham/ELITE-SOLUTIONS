/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        if(original == null || original == target)
            return cloned;
        
        TreeNode curr = getTargetCopy(original.left, cloned.left, target);
        if(curr != null)
            return curr;
        
        return getTargetCopy(original.right, cloned.right, target);
    }
}
