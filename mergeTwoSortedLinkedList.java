/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        int i1 = l1!= null ? l1.val: Integer.MAX_VALUE;
        int i2 = l2!= null ? l2.val: Integer.MAX_VALUE;
        int res = i1 < i2? i1: i2;
        if(l1 == null && l2 == null){
            return l1;
        }
        if(i1 < i2){
            if(l1 != null)
                l1 = l1.next;
        } else {
            if(l2 != null)
                l2 = l2.next;
        }
        ListNode head = new ListNode(res);
        ListNode ref = head;
        while(l1 != null || l2 != null){
            i1 = l1 != null ? l1.val: Integer.MAX_VALUE;
            i2 = l2 != null ? l2.val: Integer.MAX_VALUE;
            res = i1 < i2? i1: i2;
            ListNode temp = new ListNode(res);
            ref.next = temp;
            ref = temp;
            if(i1 < i2){
                if(l1 != null)
                    l1 = l1.next;
            } else {
                if(l2 != null)
                    l2 = l2.next;
            }
        }
        return head;
    }
}
