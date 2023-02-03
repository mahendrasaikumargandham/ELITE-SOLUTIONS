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
    public TreeNode increasingBST(TreeNode root) {
        List<Integer> arr = new ArrayList<>();
        if(root == null)
            return null;
        
        inorder(root, arr);
        TreeNode temp = new TreeNode(arr.get(0), null, null);
        TreeNode t = temp;
        // System.out.print(arr);
        // System.out.println(temp.val);
        for(int i=1;i<arr.size();i++) {
            temp.right = new TreeNode(arr.get(i), null, null);
            temp.left = null;
            temp = temp.right;
        }
        // System.out.println(temp.val);
        return t;
    }
}
