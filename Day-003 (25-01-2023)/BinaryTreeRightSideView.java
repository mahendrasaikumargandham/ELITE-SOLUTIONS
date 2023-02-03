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
    int maxLength = 0;

    void traversal(TreeNode root, List<Integer> arr, int length) {
        if(root == null) 
            return;
        if(maxLength < length) {
            arr.add(root.val);
            maxLength = length;
        }
        traversal(root.right, arr, length + 1);
        traversal(root.left, arr, length + 1);
    }

    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> arr = new ArrayList<>();
        int length = 1;
        if(root == null)
            return new ArrayList<>();
        Solution instance = new Solution();
        instance.traversal(root, arr, length);
        return arr;    
    }
}
