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
    void inorder(TreeNode root, List<Integer> arr) {
        if(root == null)
            return;
        inorder(root.left, arr);
        arr.add(root.val);
        inorder(root.right, arr);
    }
    public int minDiffInBST(TreeNode root) {
        List<Integer> arr = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        if(root == null)
            return 0;
        inorder(root, arr);
        for(int i=0;i<arr.size() - 1;i++) {
            temp.add(Math.abs(arr.get(i) - arr.get(i+1)));
        }
        return Collections.min(temp);
    }
}
