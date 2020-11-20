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
    public ListNode removeNthFromEnd(ListNode head, int n) {
      ListNode prev, temp = head;
      int curr=0, len = 0;
      while(temp != null){
        len++;
        temp = temp.next;
      }
      temp = head;
      if (len == n) { head = head.next; }
      while(temp != null){
          curr++;
          prev = temp;
          temp = temp.next;
          if (curr == (len-n)) {
              prev.next = temp.next;
              break;
          }
      }
      return head;
    }
}
