package by.vadzim.LeetCode75.Day3.T206;

import by.vadzim.LeetCode75.model.ListNode;

/**
 * Best results
 * Runtime 0 ms Beats 100%
 * Memory 41.6 MB Beats 93.58%
 *
 * @author Vadzim Matsiushonak
 */
public class Solution {

    public static void main(String[] args) {

        ListNode list = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        ListNode expected = new ListNode(5, new ListNode(4, new ListNode(3, new ListNode(2, new ListNode(1)))));

        Solution solution = new Solution();
        ListNode result = solution.reverseList(list);
        System.out.println(expected.equals(result) + " result = " + result);
    }

    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }

        ListNode result = null;
        ListNode headLeft = head;

        while (headLeft != null) {
            ListNode headRight = headLeft.next;
            headLeft.next = result;
            result = headLeft;
            headLeft = headRight;
        }

        return result;
    }

/*
    Second solution

    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }

        ListNode result = new ListNode(head.val);
        ListNode iterator;

        while (head.next != null) {
            iterator = head.next;
            result = new ListNode(iterator.val, result);
            head = head.next;
        }

        return result;
    }
*/

/*
    First solution

    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }

        int[] nodes = new int[5000];

        int i;
        for (i = 0; i < nodes.length; i++) {
            if (head == null) {
                break;
            }
            nodes[i] = head.val;
            head = head.next;
        }

        ListNode listNode = new ListNode(nodes[--i]);
        ListNode iterator = listNode;

        for (int j = --i; j >= 0; j--) {
            iterator.next = new ListNode(nodes[j]);
            iterator = iterator.next;
        }

        return listNode;
    }
*/

}
