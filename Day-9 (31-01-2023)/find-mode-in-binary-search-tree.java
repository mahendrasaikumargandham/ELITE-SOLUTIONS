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
    void inorder(TreeNode root, HashMap<Integer, Integer> list) {
        if(root == null)
            return;
        
        inorder(root.left, list);
        if(list.containsKey(root.val)) {
            list.put(root.val, list.get(root.val) + 1);
        }
        else {
            list.put(root.val, 1);
        }
        inorder(root.right, list);
    }
    public int[] findMode(TreeNode root) {

        HashMap<Integer, Integer> list = new HashMap<>();
        List<Integer> temp = new ArrayList<>();
        int[] arr;
        int max = Integer.MIN_VALUE;

        inorder(root, list);

        if(root != null && root.left == null && root.right == null && list.size() < 2) 
            return new int[]{root.val};
        else {
            for(Map.Entry<Integer, Integer> entry : list.entrySet()) {
                if(entry.getValue() > max) 
                    max = entry.getValue();
            }            
            for(Map.Entry<Integer,Integer> entry : list.entrySet()){
                if(entry.getValue() == max)
                    temp.add(entry.getKey());
            }
            arr = new int[temp.size()];
            for(int i=0;i<temp.size();i++) {
                arr[i] = temp.get(i);
            }

        }
        // System.out.print(list);
        return arr;
    }
}
