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
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) return true;
        ListNode slow = head, fast = head;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode secondHalfReversed = reverseLL(slow);
        while(head != null && secondHalfReversed != null) {
            if(head.val != secondHalfReversed.val) return false;
            else {
                head = head.next;
                secondHalfReversed = secondHalfReversed.next;
            }
        }
        return true;
        
    }

    public ListNode reverseLL(ListNode head) {
        ListNode prev = null;
        while(head != null) {
            ListNode nextNode = head.next;
            head.next = prev;
            prev = head;
            head = nextNode;
        }
        return prev;
    }
}