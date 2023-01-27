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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if(root == null)
            return list;
        boolean isForward = true;

        queue.offer(root);
        while(!queue.isEmpty()) {
            List<Integer> arr = new ArrayList<>();
            int size = queue.size();
            for(int i=1;i<=size;i++) {
                TreeNode element = queue.poll();
                if(isForward)
                    arr.add(element.val);
                else
                    arr.add(0, element.val);
                
                if(element.left != null)
                    queue.offer(element.left);
                if(element.right != null)
                    queue.offer(element.right);
            }

            list.add(arr);
            isForward = !isForward;
        }
        return list;
    }
}
