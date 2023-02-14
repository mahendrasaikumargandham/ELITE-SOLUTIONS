class Solution {
    public int firstMinNode = Integer.MAX_VALUE;
    public int secondMinNode = Integer.MAX_VALUE;
    public boolean flag = false;

    public void dfs(TreeNode root) {
        if(root == null)
            return;
        if(root.val <= firstMinNode) 
            firstMinNode = root.val;
        else if(root.val > firstMinNode && root.val <= secondMinNode) {
            secondMinNode = root.val;
            flag = true;
        }
        dfs(root.left);
        dfs(root.right);
    }

    public int findSecondMinimumValue(TreeNode root) {
        if(root == null)
            return -1;

        Solution instance = new Solution();
        instance.dfs(root);

        if(instance.flag)
            return instance.secondMinNode;

        return -1;
    }
}
