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

    public boolean findTarget(TreeNode root, int k) {
        if(root == null)
            return false;

        List<Integer> arr = new ArrayList<>();
        inorder(root, arr);
        // System.out.println("HashMap "+map);
        if(arr.size() <= 1)
            return false;
        for(int i=0;i<arr.size()-1;i++) {
            for(int j=1;j<arr.size();j++) {
                if(arr.get(i) + arr.get(j) == k && i!=j) 
                    return true;
            }
        }
        return false;
    }
}
