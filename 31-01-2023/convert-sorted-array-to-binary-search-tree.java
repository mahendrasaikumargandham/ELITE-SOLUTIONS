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
    public TreeNode construct(int[] nums, int start, int end) {
        
        if(start > end)
            return null;
        int index = (start + end) / 2;
        TreeNode temp = new TreeNode(nums[index]);
        temp.left = construct(nums, start, index-1);
        temp.right = construct(nums, index+1, end);

        return temp;
    }

    public TreeNode sortedArrayToBST(int[] nums) {
        int start = 0;
        int end = nums.length-1;
        return construct(nums, start, end);
    }
}
