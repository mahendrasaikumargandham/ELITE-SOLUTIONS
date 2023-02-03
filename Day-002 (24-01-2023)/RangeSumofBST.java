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
    public int rangeSumBST(TreeNode root, int low, int high) {
        List<Integer> arr = new ArrayList<>();
        int sum = 0;
        if(root == null)
            return 0;
        inorder(root, arr);
        for(int i = arr.indexOf(low); i<=arr.indexOf(high);i++) {
            sum += arr.get(i);
        }
        return sum;
    }
}
