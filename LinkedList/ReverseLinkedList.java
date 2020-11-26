// https://leetcode.com/problems/reverse-linked-list/

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

// Iterative
class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        ListNode curr, prev = null;
        ListNode node = head;
        while(node != null) {
            curr = node.next;
            node.next = prev;
            prev = node;
            node = curr;
        }
        return prev;
    }
}

