/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode head1, ListNode head2) {

     ListNode dummy = new ListNode();
     ListNode ans = dummy; // ans.next will give me the head of the list as dummy will iterate in the list we are adding the value

        while (head1 != null && head2 != null) {
             if (head1.val <= head2.val) {
                dummy.next = new ListNode(head1.val);
                dummy = dummy.next; 
                head1 = head1.next;
            }

            else {
                dummy.next = new ListNode(head2.val);
                dummy = dummy.next;
                head2 = head2.next;
            }
        }

 // at this point one of the list reach the end so we will check the one which have remaining nodes so we will add them in the list as they are sorted

        while (head1 != null) {
            dummy.next = new ListNode(head1.val);
            dummy = dummy.next; 
            head1 = head1.next;
  }

        while (head2 != null) {
            dummy.next = new ListNode(head2.val);
            dummy = dummy.next;
            head2 = head2.next;
        }

        return ans.next;
    }
}