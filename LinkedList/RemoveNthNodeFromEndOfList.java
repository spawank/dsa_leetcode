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

// Approach 1

class Solution {
  public ListNode removeNthFromEnd(ListNode head, int n) {
      int i=0;
      ListNode node, prev;
      node = head;
      prev = head;
      if (head == null) return head;
      
      while (node != null) {
         if (i <= n) { i++; }
          else {
             prev = prev.next;
          }
         node = node.next;
      }
      
      if (i < n) return null; 
      if(i == n) { head = head.next; }
      else { prev.next = prev.next.next; }
      
      return head;
  }
}

//  Approach 2:
// class Solution {
//     public ListNode removeNthFromEnd(ListNode head, int n) {
//       ListNode prev, temp = head;
//       int curr=0, len = 0;
//       while(temp != null){
//         len++;
//         temp = temp.next;
//       }
//       temp = head;
//       if (len == n) { head = head.next; }
//       while(temp != null){
//           curr++;
//           prev = temp;
//           temp = temp.next;
//           if (curr == (len-n)) {
//               prev.next = temp.next;
//               break;
//           }
//       }
//       return head;
//     }
// }
