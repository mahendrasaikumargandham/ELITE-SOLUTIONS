class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<Double> arr = new ArrayList<>();

        if(root == null)
            return arr;
        
        queue.offer(root);
        while(!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> temp = new ArrayList<>();
            double sum = 0.0;
            double avg = 0.0;
            for(int i=1;i<=size;i++) {
                TreeNode ele = queue.poll();
                temp.add(ele.val);
                if(ele.left != null)
                    queue.offer(ele.left);
                if(ele.right != null)
                    queue.offer(ele.right);
            }

            for(int i=0;i<temp.size();i++) {
                sum = sum + temp.get(i);
            }
            avg = sum / temp.size();
            arr.add(avg);
        }
        return arr;
    }
}
