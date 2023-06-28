class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode node = new ListNode(); 
        ListNode prev = node;
        node.next = head;
        while(head!=null)
        {
            if(head.next !=null && head.val == head.next.val)
            {
                while(head.next != null && head.val == head.next.val)
                head = head.next;
                prev.next = head.next;
            }
            else
            prev = prev.next;
            head = head.next;
        }
        return node.next;
    }
}
