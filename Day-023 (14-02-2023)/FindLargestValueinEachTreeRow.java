class Solution {
    public List<Integer> largestValues(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<Integer> arr = new ArrayList<>();

        if(root == null)
            return arr;
        
        queue.offer(root);
        while(!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> temp = new ArrayList<>();
            for(int i=1;i<=size;i++) {
                TreeNode node = queue.poll();
                temp.add(node.val);
                if(node.left != null)
                    queue.offer(node.left);
                if(node.right != null)
                    queue.offer(node.right);
            }
            arr.add(Collections.max(temp));
        }
        return arr;
    }
}
