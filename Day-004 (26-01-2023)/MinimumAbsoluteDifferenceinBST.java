class Solution {
    void inorder(TreeNode root, List<Integer> arr) {
        if(root == null)
        return;

        inorder(root.left, arr);
        arr.add(root.val);
        inorder(root.right, arr);
    }

    public int getMinimumDifference(TreeNode root) {
        List<Integer> arr = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        Solution instance = new Solution();
        instance.inorder(root, arr);
        System.out.println("arr "+arr);
        for(int i=0;i<arr.size()-1;i++) {
            temp.add(Math.abs(arr.get(i) - arr.get(i+1)));
        }
        System.out.println("temp "+temp);
        return Collections.min(temp);
    }
}
