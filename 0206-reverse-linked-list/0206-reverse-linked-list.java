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
    public ListNode reverseList(ListNode head) {
        Deque<Integer> valueStack = new ArrayDeque<>();
        while(head!=null){
            valueStack.push(head.val);
            head = head.next;
        }

        ListNode reverseList = new ListNode(Integer.MIN_VALUE);
        ListNode ptr = reverseList;

        while(!valueStack.isEmpty()){
            ptr.next = new ListNode(valueStack.pop());
            ptr = ptr.next;
        }
        return reverseList.next;
    }
}