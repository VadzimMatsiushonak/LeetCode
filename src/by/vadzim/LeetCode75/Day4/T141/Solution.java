package by.vadzim.LeetCode75.Day4.T141;

/**
 * Best results
 * Runtime 0 ms Beats 100%
 * Memory 43.2 MB Beats 90.54%
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
        boolean result = solution.hasCycle(l1);
        System.out.println((true == result) + " result = " + result);

        l4.next = null;
        result = solution.hasCycle(l1);
        System.out.println((true == result) + " result = " + result);
    }

    public boolean hasCycle(ListNode head) {
        while (head != null) {
            if (head.val == Integer.MAX_VALUE) {
                return true;
            }
            head.val = Integer.MAX_VALUE;
            head = head.next;
        }
        return false;
    }

/*
    Another solution
    public boolean hasCycle(ListNode head) {
        int hash = head.hashCode();
        while (head != null) {
            if (head.val == hash) {
                return true;
            }
            head.val = hash;
            head = head.next;
        }
        return false;
    }
*/

}
