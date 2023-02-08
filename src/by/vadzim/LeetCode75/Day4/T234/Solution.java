package by.vadzim.LeetCode75.Day4.T234;

import by.vadzim.LeetCode75.model.ListNode;

/**
 * Best results
 * Runtime 4 ms Beats 86.18%
 * Memory 52 MB Beats 99.18%
 *
 * @author Vadzim Matsiushonak
 */

public class Solution {

    public static void main(String[] args) {
        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(2, new ListNode(1)))));
        ListNode list2 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(2, new ListNode(0)))));

        Solution solution = new Solution();

        boolean result1 = solution.isPalindrome(list1);
        boolean result2 = solution.isPalindrome(list2);

        System.out.println((true == result1) + " result1 = " + result1);
        System.out.println((false == result2) + " result2 = " + result2);
    }

    public boolean isPalindrome(ListNode head) {
        long value = 0;
        long reverse = 0;
        long length = 1;

        while (head != null) {
            value = (value << 1) + (value << 3) + head.val;
            reverse = head.val * length + reverse;
            head = head.next;
            length = (length << 1) + (length << 3);
        }

        return value == reverse;
    }


}
