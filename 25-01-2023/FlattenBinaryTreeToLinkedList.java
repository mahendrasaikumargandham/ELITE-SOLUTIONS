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
    List<Integer> arr = new LinkedList<>();

    void traverse(TreeNode root, List<Integer> arr) {
        if(root == null)
            return;
        arr.add(root.val);
        traverse(root.left, arr);
        traverse(root.right, arr);     

    }
    public void flatten(TreeNode root) {
        if(root == null)
            return; 
        Solution instance = new Solution();
        instance.traverse(root, arr); 

        for(int i=1;i<arr.size();i++) {
            root.left = null;
            root.right = new TreeNode(arr.get(i), null, null);
            root = root.right;
        }
    }
}
