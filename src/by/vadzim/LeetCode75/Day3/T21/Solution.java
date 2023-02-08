package by.vadzim.LeetCode75.Day3.T21;

import by.vadzim.LeetCode75.model.ListNode;

/**
 * Best results
 * <p>
 * Runtime 0 ms Beats 100%
 * <p>
 * Memory 41.4 MB Beats 98.86%
 *
 * @author Vadzim Matsiushonak
 */
public class Solution {

    public static void main(String[] args) {
        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4)));

        Solution solution = new Solution();

        ListNode expected = new ListNode(1,
            new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(4))))));
        ListNode result = solution.mergeTwoLists(list1, list2);

        System.out.println(expected.equals(result) + " result = " + result);

    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        } else if (list2 == null) {
            return list1;
        }
        int val;
        if (list1.val <= list2.val) {
            val = list1.val;
            list1 = list1.next;
        } else {
            val = list2.val;
            list2 = list2.next;
        }
        return new ListNode(val, mergeTwoLists(list1, list2));
    }

/*
    Better solution
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }

        if (list1.val < list2.val) {
            list1.next = mergeTwoLists(list1.next, list2);
            return list1;
        } else {
            list2.next = mergeTwoLists(list2.next, list1);
            return list2;
        }
    }
*/

}
