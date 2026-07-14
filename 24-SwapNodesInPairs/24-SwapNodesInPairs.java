// Last updated: 7/14/2026, 2:04:41 PM
class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode temp = dummy;


        while(temp.next != null && temp.next.next != null){
            ListNode cur = temp.next;
            ListNode next = temp.next.next;
            cur.next = next.next;
            next.next = cur;
            temp.next = next;

            temp = cur;
        }

        return dummy.next;

    }
}