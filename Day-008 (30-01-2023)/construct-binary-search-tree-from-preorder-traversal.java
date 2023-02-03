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
    TreeNode construct(int[] preorder, int upper, int[] curr) {
        if(curr[0] == preorder.length) 
            return null;
        
        if(preorder[curr[0]] > upper) 
            return null;
        
        TreeNode temp = new TreeNode(preorder[curr[0]++]);
        temp.left = construct(preorder, temp.val, curr);
        temp.right = construct(preorder, upper, curr);
        return temp;
    }
    
    public TreeNode bstFromPreorder(int[] preorder) {
        int upper = Integer.MAX_VALUE;
     
        return construct(preorder, upper, new int[]{0});
    }
}
