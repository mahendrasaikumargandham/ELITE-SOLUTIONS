class Solution {
    public int minDepth(TreeNode root) {
        if(root == null) 
            return 0;
        
        if(root.left == null && root.right == null)
            return 1;
      
        int left = minDepth(root.left);
        int right = minDepth(root.right);

        int result = (left == 0 || right == 0) ? (left + right + 1) : Math.min(left, right) + 1;
        return result;
    }
}
