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
// https://leetcode.com/problems/swap-nodes-in-pairs/

class Solution {
    public ListNode swapPairs(ListNode head) {
      if (head == null || head.next == null) return head;
         ListNode temp;
         ListNode next = swapPairs(head.next.next);
         temp = head.next;
         head.next = next;
         temp.next = head;
         return temp;
    }
}