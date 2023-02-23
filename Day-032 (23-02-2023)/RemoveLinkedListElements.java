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
 
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        List<Integer> arr = new ArrayList<>();
        if(head == null) {
            return null;
        }

        while(head != null) {
            if(head.val != val) 
                arr.add(head.val);
            head = head.next;
        }
        System.out.println(arr);
        if(arr.size() > 0) {
            ListNode curr = new ListNode(arr.get(0));
            ListNode temp = curr;
            for(int i=1;i<arr.size();i++) {
                curr.next = new ListNode(arr.get(i));
                curr = curr.next;
            }
            return temp;
        }
        return head;
    }
}
