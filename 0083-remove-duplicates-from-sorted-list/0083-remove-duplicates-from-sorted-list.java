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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(Integer.MIN_VALUE);
        dummy.next = head;
        ListNode ptr = dummy;
        while(ptr!=null && ptr.next!=null){
            if(ptr.val==ptr.next.val){
                ptr.next = ptr.next.next;
            } else {
                ptr = ptr.next;
            }
        }
        return dummy.next;
    }
}