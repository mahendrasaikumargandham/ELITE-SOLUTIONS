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
    HashMap<Integer, Integer> map = new HashMap<>();
    int preorderIndex = 0;
    TreeNode buildTreeNode(int[] preorder, int[] inorder, int start, int end) {
        if(start > end)
            return null;

        TreeNode root = new TreeNode(preorder[preorderIndex++]);
        if(root == null)
            return null;

        if(start == end)
            return root;

        int index = map.get(root.val);
        root.left = buildTreeNode(preorder, inorder, start, index-1);
        root.right = buildTreeNode(preorder, inorder, index+1, end);

        return root;
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int start = 0;
        int end = inorder.length - 1;
        for(int i=0;i<inorder.length;i++)
            map.put(inorder[i], i);
        
        return buildTreeNode(preorder, inorder, start, end);
    }
}
