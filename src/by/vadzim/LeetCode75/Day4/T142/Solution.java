package by.vadzim.LeetCode75.Day4.T142;

import by.vadzim.LeetCode75.Day4.T141.ListNode;

/**
 * Best results
 * <p>
 * Runtime 0 ms Beats 100%
 * <p>
 * Memory 42.4 MB Beats 92.37%
 *
 * @author Vadzim Matsiushonak
 */
public class Solution {
    
    public static void main(String[] args) {
        ListNode l1 = new ListNode(3);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(0);
        ListNode l4 = new ListNode(-4);

        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l2;

        Solution solution = new Solution();
        ListNode result = solution.detectCycle(l1);
        System.out.println((l2 == result) + " result = " + result);

        l1 = new ListNode(3);
        l2 = new ListNode(2);
        l3 = new ListNode(0);
        l4 = new ListNode(-4);

        l1.next = l2;
        l2.next = l3;
        l3.next = l4;

        result = solution.detectCycle(l1);
        System.out.println((null == result) + " result = " + result);
    }
    
    public ListNode detectCycle(ListNode head) {
    if (head == null) {
        return null;
    }
    while (head != null) {
        if (head.val == Integer.MAX_VALUE) {
            return head;
        }
        head.val = Integer.MAX_VALUE;
        head = head.next;
    }
    return null;
}

}
