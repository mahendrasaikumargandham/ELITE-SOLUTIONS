class Solution {
    int maxLength = Integer.MIN_VALUE;
    int postorder(TreeNode root) {
        if(root == null)
            return 0;
        
        int left = Math.max(0, postorder(root.left));
        int right = Math.max(0, postorder(root.right));

        if(maxLength < root.val + left + right)
            maxLength = root.val + left + right;

        return Math.max(left, right) + root.val;
    }
    public int maxPathSum(TreeNode root) {
        if(root == null)
            return 0;
        
        postorder(root);
        return maxLength;
    }
}
