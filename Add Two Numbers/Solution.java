/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        int sum = 0;
        int add = 0;
        ListNode res = new ListNode(0);
        ListNode head = res;
        
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        
        while (l1 != null || l2 != null || add == 1) {
            ListNode cur = new ListNode(0);
            sum = (l1 == null ? 0 : l1.val) + (l2 == null ? 0 : l2.val) + add;
            add = sum / 10;
            cur.val = sum % 10;
            res.next = cur;
            res = cur;
            l1 = l1 != null ? l1.next : null;
            l2 = l2 != null ? l2.next : null;
        }
        
        return head.next;
    }
}