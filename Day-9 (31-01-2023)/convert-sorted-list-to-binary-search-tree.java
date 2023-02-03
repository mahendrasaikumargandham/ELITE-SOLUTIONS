/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

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
    TreeNode construct(List<Integer> arr, int start, int end) {
        if(start > end)
            return null;
        
        int index = (start + end) / 2;
        TreeNode temp = new TreeNode(arr.get(index));
        temp.left = construct(arr, start, index-1);
        temp.right = construct(arr, index+1, end);
        return temp;
    }
    public TreeNode sortedListToBST(ListNode head) {
        List<Integer> arr = new ArrayList<>();

        ListNode curr = head;
        while(curr != null) {
            arr.add(curr.val);
            curr = curr.next;
        }
        System.out.println(arr);

        return construct(arr, 0, arr.size()-1);
    }
}
