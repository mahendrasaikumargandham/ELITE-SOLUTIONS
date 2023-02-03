class Solution {
    void traverse(TreeNode root, List<List<Integer>> list, int level) {
        if(root == null)
            return;
        if(list.size() == level) {
            list.add(new ArrayList<>());
        }
        list.get(level).add(root.val);
        traverse(root.left, list, level+1);
        traverse(root.right, list, level+1);
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        if(root == null)
            return list;
        Solution instance = new Solution();
        instance.traverse(root, list, 0);
        return list;
    }
}
