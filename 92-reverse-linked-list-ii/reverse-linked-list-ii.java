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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || left == right) {
            return head;
        }
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode prevNode = dummy;
        for (int i = 0; i < left - 1; i++) {
            prevNode = prevNode.next;
        }
        ListNode curr = prevNode.next;
        ListNode end = curr;        
        for (int i = 0; i < right - left; i++) {
            end = end.next;
        }        
        ListNode temp = end.next;
        end.next = null;
        prevNode.next = reverse(curr);       
        curr.next = temp;       
        return dummy.next;
    }
    public static ListNode reverse(ListNode head) {
        ListNode p = head, q = null, r = null;
        while (p != null) {
            r = q;
            q = p;
            p = p.next;
            q.next = r;
        }
        return q;
    }
}