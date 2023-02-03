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

    TreeNode construct(List<Integer> arr, int start, int end) {
        if(start > end)
            return null;
        
        int mid = (start + end) / 2;
        TreeNode temp = new TreeNode(arr.get(mid));
        temp.left = construct(arr, start, mid-1);
        temp.right = construct(arr, mid+1, end);
        return temp;
    }
    public TreeNode balanceBST(TreeNode root) {
        List<Integer> arr = new ArrayList<>();

        inorder(root, arr);
        return construct(arr, 0, arr.size()-1);
    }
}
